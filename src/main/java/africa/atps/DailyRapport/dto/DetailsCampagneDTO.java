package africa.atps.DailyRapport.dto;

import java.io.Serializable;

public class DetailsCampagneDTO implements Serializable {

    private Long idclient;

    private String reference;

    private String code;

    private String statut;

    private String createdAt;

    private String updateAt;

    private String nomClient;

    private String agence;

    private String messageRetour;

    private Long idDetailsCompagne;

    private String echeance ;

    private Long frais;

    private String typeCanal;

    private Long montant;

    private String telephone;

    private String canal;

    private String nom ;

    private String prenom;

    private String motif;

    private String email;

    private String commentaire;

    private String type_piece;

    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getMessageRetour() {
        return messageRetour;
    }

    public void setMessageRetour(String messageRetour) {
        this.messageRetour = messageRetour;
    }

    public Long getIdDetailsCompagne() {
        return idDetailsCompagne;
    }

    public void setIdDetailsCompagne(Long idDetailsCompagne) {
        this.idDetailsCompagne = idDetailsCompagne;
    }

    public String getEcheance() {
        return echeance;
    }

    public void setEcheance(String echeance) {
        this.echeance = echeance;
    }

    public Long getFrais() {
        return frais;
    }

    public void setFrais(Long frais) {
        this.frais = frais;
    }

    public String getTypeCanal() {
        return typeCanal;
    }

    public void setTypeCanal(String typeCanal) {
        this.typeCanal = typeCanal;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }


    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getType_piece() {
        return type_piece;
    }

    public void setType_piece(String type_piece) {
        this.type_piece = type_piece;
    }

    @Override
    public String toString() {
        return "DetailsCampagneDTO_{" +
            "idclient=" + idclient +
            ", reference='" + reference + '\'' +
            ", code='" + code + '\'' +
            ", statut='" + statut + '\'' +
            ", createdAt='" + createdAt + '\'' +
            ", updateAt='" + updateAt + '\'' +
            ", nomClient='" + nomClient + '\'' +
            ", agence='" + agence + '\'' +
            ", messageRetour='" + messageRetour + '\'' +
            ", idDetailsCompagne=" + idDetailsCompagne +
            ", echeance='" + echeance + '\'' +
            ", frais=" + frais +
            ", typeCanal='" + typeCanal + '\'' +
            ", montant=" + montant +
            ", telephone='" + telephone + '\'' +
            ", canal='" + canal + '\'' +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", motif='" + motif + '\'' +
            ", email='" + email + '\'' +
            ", commentaire='" + commentaire + '\'' +
            ", type_piece='" + type_piece + '\'' +
            ", date='" + date + '\'' +
            '}';
    }
}

