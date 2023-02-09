package africa.atps.DailyRapport.service.serviceImpl;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public interface ExcelService {
    public void createWithPassword( List<String> content, String password) throws IOException, GeneralSecurityException, InvalidFormatException;
    XSSFWorkbook createWorkbookFromDB(File xlsxFile,String[]entete,List<String> data) throws IOException;
}
