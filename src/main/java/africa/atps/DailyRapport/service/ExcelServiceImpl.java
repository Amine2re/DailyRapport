package africa.atps.DailyRapport.service;

import africa.atps.DailyRapport.service.serviceImpl.ExcelService;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionMode;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.stereotype.Service;
import africa.atps.DailyRapport.constants.Constants;


import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
@Service
public class ExcelServiceImpl implements ExcelService {
//    static String[] entete = {"cmpg_id", "cmpg_nom", "cmpg_status", "cmpg_date", "cmpg_fichier", "cmpg_fichier_original",
//        "cmpg_txtsms", "cmpg_esp", "cmpg_partner", "cmpg_mois", "cmpg_type", "frais_id", "cmpg_user",
//        "cmpg_type_canal", "cmpg_canal", "cmpg_created", "filiale", "entite", "montant_total", "frais_total",
//        "cmpg_nbclients", "canal_id"};
    static List<String> data = new ArrayList<>();
    String[] entete = Constants.getEntete();
//    public static void main(String[] args) throws GeneralSecurityException, IOException, InvalidFormatException {
//        data.add("Mouhamed");
//        data.add("Hassan");
//        data.add("David");
//        data.add("Moussa");
//        data.add("nothing");
//
//        ExcelServiceImpl ex = new ExcelServiceImpl();
//        ex.createWithPassword(data,"aptupay");
//    }

    @Override
    public void createWithPassword(List<String> content, String password) throws IOException, GeneralSecurityException, InvalidFormatException {

        File xlsxFile = new File("C:\\Users\\Amine.toure\\Documents\\Amine_Toure\\day08022023Mouha.xlsx");

         createWorkbookFromDB(xlsxFile,entete,data);

        try (POIFSFileSystem fs = new POIFSFileSystem()) {

            EncryptionInfo info = new EncryptionInfo(EncryptionMode.agile);
            Encryptor encryptor = info.getEncryptor();

            encryptor.confirmPassword(password);

            try (OPCPackage opc = OPCPackage.open(xlsxFile, PackageAccess.READ_WRITE);
                 OutputStream os = encryptor.getDataStream(fs)) {
                opc.save(os);
            }

            try (FileOutputStream fos = new FileOutputStream(xlsxFile)) {
                fs.writeFilesystem(fos);
            }
        }
    }

    @Override
    public XSSFWorkbook createWorkbookFromDB(File xlsxFile,String[]entete,List<String> data) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Creating sheet
        XSSFSheet sheet = workbook.createSheet("Employee Records");

        // Creating header of the sheet
        XSSFRow header = sheet.createRow(0);

        // parcourir entete et l'ajouter dans le header
        AtomicInteger index = new AtomicInteger();
        Stream.of(entete).forEach(ent -> {
            header.createCell(Integer.valueOf(index.toString())).setCellValue(ent);
            index.getAndIncrement();
        });


        XSSFRow row1 = sheet.createRow(1);

        AtomicInteger index_ = new AtomicInteger();
        data.forEach(val -> {
            row1.createCell(Integer.valueOf(index_.toString())).setCellValue(val);
            index_.getAndIncrement();
        });

        // Write the workbook data to a file
        try (FileOutputStream fos = new FileOutputStream(xlsxFile)) {
            workbook.write(fos);
            fos.close();
            workbook.close();
        }
        return workbook;
    }
}
