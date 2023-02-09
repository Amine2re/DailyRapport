package africa.atps.DailyRapport.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * A Campagne.
 */
@Entity
@Table(name = "campagne")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Campagne implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "cmpg_id")
    private Long id;

    @Column(name = "cmpg_user")
    private String user;

    @Column(name = "cmpg_nom")
    private String nom;

    @Column(name = "cmpg_status")
    private String status;

    /*    @Column(name = "cmpg_mnt_total")
        private String montantTotal;

        @Column(name = "cmpg_nb_client")
        private String client;*/
    @Column(name = "cmpg_date")
    private String date;

    @Column(name = "cmpg_fichier")
    private String fichier;

    @Column(name = "cmpg_fichier_original")
    private String fichierOriginal;

    @Column(name = "cmpg_txtsms")
    private String txtsms;

    @Column(name = "cmpg_esp")
    private String esp;

    @Column(name = "cmpg_partner")
    private String partner;

    @Column(name = "cmpg_type_canal")
    private String typeCanal;

    @Column(name = "cmpg_canal")
    private String canal;

    @Column(name = "cmpg_mois")
    private String mois;

    @Column(name = "cmpg_created")
    private ZonedDateTime created;

    @Column(name = "cmpg_type")
    private String type;

    @Column(name = "frais_id")
    private Integer fraisId;

    @Column(name = "filiale")
    private Long filiale;

    @Column(name = "entite")
    private Long entite;

    @Column(name = "montant_total")
    private Double montantTotal;

    @Column(name = "frais_total")
    private Double fraisTotal;

    @Column(name="cmpg_nbclients", columnDefinition = "integer default 0")
    private Integer nbClients;

    public Campagne(Long id, String user, String nom, String status, String date, String fichier, String fichierOriginal, String txtsms, String esp, String partner, String typeCanal, String canal, String mois, ZonedDateTime created, String type, Integer fraisId, Long filiale, Long entite, Double montantTotal, Double fraisTotal, Integer nbClients, Integer canal_id) {
        this.id = id;
        this.user = user;
        this.nom = nom;
        this.status = status;
        this.date = date;
        this.fichier = fichier;
        this.fichierOriginal = fichierOriginal;
        this.txtsms = txtsms;
        this.esp = esp;
        this.partner = partner;
        this.typeCanal = typeCanal;
        this.canal = canal;
        this.mois = mois;
        this.created = created;
        this.type = type;
        this.fraisId = fraisId;
        this.filiale = filiale;
        this.entite = entite;
        this.montantTotal = montantTotal;
        this.fraisTotal = fraisTotal;
        this.nbClients = nbClients;
        this.canal_id = canal_id;
    }

    public Campagne() {

    }

    public Integer getCanal_id() {
        return canal_id;
    }

    public void setCanal_id(Integer canal_id) {
        this.canal_id = canal_id;
    }

    private Integer canal_id;
    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public Campagne user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNom() {
        return nom;
    }

    public Campagne nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatus() {
        return status;
    }

    public Campagne status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCanal() {
        return canal;
    }

    public Campagne canal(String canal) {
        this.canal = canal;
        return this;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getTypeCanal() {
        return typeCanal;
    }

    public Campagne typeCanal(String typeCanal) {
        this.typeCanal = typeCanal;
        return this;
    }

    public void setTypeCanal(String typeCanal) {
        this.typeCanal = typeCanal;
    }

    public String getDate() {
        return date;
    }

    public Campagne date(String date) {
        this.date = date;
        return this;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFichier() {
        return fichier;
    }

    public Campagne fichier(String fichier) {
        this.fichier = fichier;
        return this;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getFichierOriginal() {
        return fichierOriginal;
    }

    public Campagne fichierOriginal(String fichierOriginal) {
        this.fichierOriginal = fichierOriginal;
        return this;
    }

    public void setFichierOriginal(String fichierOriginal) {
        this.fichierOriginal = fichierOriginal;
    }

    public String getTxtsms() {
        return txtsms;
    }

    public Campagne txtsms(String txtsms) {
        this.txtsms = txtsms;
        return this;
    }

    public void setTxtsms(String txtsms) {
        this.txtsms = txtsms;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public Campagne created(ZonedDateTime created) {
        this.created = created;
        return this;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public String getEsp() {
        return esp;
    }

    public Campagne esp(String esp) {
        this.esp = esp;
        return this;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getPartner() {
        return partner;
    }

    public Campagne partner(String partner) {
        this.partner = partner;
        return this;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getMois() {
        return mois;
    }

    public Campagne mois(String mois) {
        this.mois = mois;
        return this;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getType() {
        return type;
    }

    public Campagne type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFraisId() {
        return fraisId;
    }

    public Campagne fraisId(Integer fraisId) {
        this.fraisId = fraisId;
        return this;
    }

    public void setFraisId(Integer fraisId) {
        this.fraisId = fraisId;
    }

    public Long getFiliale() {
        return filiale;
    }

    public Campagne filiale(Long filiale) {
        this.filiale = filiale;
        return this;
    }

    public void setFiliale(Long filiale) {
        this.filiale = filiale;
    }

    public Long getEntite() {
        return entite;
    }

    public Campagne entite(Long entite) {
        this.entite = entite;
        return this;
    }

    public void setEntite(Long entite) {
        this.entite = entite;
    }

    public Double getMontantTotal() {
        return montantTotal;
    }

    public Campagne montantTotal(Double montantTotal) {
        this.montantTotal = montantTotal;
        return this;
    }

    public void setMontantTotal(Double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Integer getNbClients() {
        return nbClients;
    }

    public Campagne nbClients(Integer nbClients) {
        this.nbClients = nbClients;
        return this;
    }

    public void setNbClients(Integer nbClients) {
        this.nbClients = nbClients;
    }

    public Double getFraisTotal() {
        return fraisTotal;
    }

    public Campagne fraisTotal(Double fraisTotal) {
        this.fraisTotal = fraisTotal;
        return this;
    }


    public void setFraisTotal(Double fraisTotal) {
        this.fraisTotal = fraisTotal;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Campagne)) {
            return false;
        }
        return id != null && id.equals(((Campagne) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }


    @Override
    public String toString() {
        return "Campagne{" +
            "id=" + id +
            ", user='" + user + '\'' +
            ", nom='" + nom + '\'' +
            ", status='" + status + '\'' +
            ", date='" + date + '\'' +
            ", fichier='" + fichier + '\'' +
            ", fichierOriginal='" + fichierOriginal + '\'' +
            ", txtsms='" + txtsms + '\'' +
            ", esp='" + esp + '\'' +
            ", partner='" + partner + '\'' +
            ", typeCanal='" + typeCanal + '\'' +
            ", canal='" + canal + '\'' +
            ", mois='" + mois + '\'' +
            ", created=" + created +
            ", type='" + type + '\'' +
            ", fraisId=" + fraisId +
            ", filiale=" + filiale +
            ", entite=" + entite +
            ", montantTotal=" + montantTotal +
            ", fraisTotal=" + fraisTotal +
            ", nbClients=" + nbClients +
            ", canal_id=" + canal_id +
            '}';
    }
}
