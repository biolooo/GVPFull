package com.lra.GVP.Config;

import com.lra.GVP.Helper.ArtOrgaEinheit;
import com.lra.GVP.Model.Mitarbeiter;
import com.lra.GVP.Model.OrgaEinheit;
import com.lra.GVP.Repo.MitarbeiterRepo;
import com.lra.GVP.Repo.OrgaEinheitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrgaEinheitConfig {
    @Bean
    CommandLineRunner commandLineRunner(OrgaEinheitRepo orgaEinheitRepo, MitarbeiterRepo mitarbeiterRepo) {
        return args -> {
            //Initiale Dezernate
            OrgaEinheit dezernat1 = new OrgaEinheit("Dezernat 1", null, ArtOrgaEinheit.Dezernat);
            OrgaEinheit dezernat2 = new OrgaEinheit("Dezernat 2", null, ArtOrgaEinheit.Dezernat);
            OrgaEinheit dezernat3 = new OrgaEinheit("Dezernat 3", null, ArtOrgaEinheit.Dezernat);
            OrgaEinheit dezernat4 = new OrgaEinheit("Dezernat 4", null, ArtOrgaEinheit.Dezernat);
            OrgaEinheit dezernat5 = new OrgaEinheit("Dezernat 5", null, ArtOrgaEinheit.Dezernat);
            OrgaEinheit dezernat6 = new OrgaEinheit("Dezernat 6", null, ArtOrgaEinheit.Dezernat);

            Mitarbeiter dezernent1 = new Mitarbeiter(0, dezernat1, null, "Max", "Muster", "0123456789", "101", "Dezernent Dezernat 1");
            Mitarbeiter dezernent2 = new Mitarbeiter(0, dezernat2, null, "Anna", "Beispiel", "0123456790", "201", "Dezernent Dezernat 2");
            Mitarbeiter dezernent3 = new Mitarbeiter(0, dezernat3, null, "Peter", "Mustermann", "0123456791", "301", "Dezernent Dezernat 3");
            Mitarbeiter dezernent4 = new Mitarbeiter(0, dezernat4, null, "Klara", "Beispiel", "0123456792", "401", "Dezernent Dezernat 4");
            Mitarbeiter dezernent5 = new Mitarbeiter(0, dezernat5, null, "Hans", "Mustermann", "0123456793", "501", "Dezernent Dezernat 5");
            Mitarbeiter dezernent6 = new Mitarbeiter(0, dezernat6, null, "Eva", "Beispiel", "0123456794", "601", "Dezernent Dezernat 6");

            //Initiale Ämter
            OrgaEinheit organisationsentwicklung = new OrgaEinheit("Organisationsentwicklung & Zentrale Services", dezernat1, ArtOrgaEinheit.Amt);
            OrgaEinheit zentraleServices1 = new OrgaEinheit("Zentrale Services I", organisationsentwicklung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit organisationKreistag = new OrgaEinheit("Organisation, Geschäftsstelle Kreistag & Zentraler Einkauf", organisationsentwicklung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit itServiceInfrastruktur = new OrgaEinheit("IT-Service Infrastruktur & Helpdesk", organisationsentwicklung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit itServiceDigitaleDienste = new OrgaEinheit("IT-Service Digitale Dienste & Helpdesk", organisationsentwicklung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit digitalisierung = new OrgaEinheit("Digitalisierung & Zentrale Services II", organisationsentwicklung, ArtOrgaEinheit.Sachgebiet);


            OrgaEinheit personalamt = new OrgaEinheit("Personalamt", dezernat1, ArtOrgaEinheit.Amt);
            OrgaEinheit personalentwicklung = new OrgaEinheit("Personalentwicklung", personalamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit personalsachbearbeitung = new OrgaEinheit("Personalsachbearbeitung", personalamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit kaemmerei = new OrgaEinheit("Kämmerei und Gebäudemanagement", dezernat1, ArtOrgaEinheit.Amt);
            OrgaEinheit haushalt = new OrgaEinheit("Haushalt, Beteiligungen, Betriebswirtschaft", kaemmerei, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit gebaeudemanagement = new OrgaEinheit("Gebäudemanagement", kaemmerei, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit zentraleBeitreibung = new OrgaEinheit("Zentrale Beitreibung", kaemmerei, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kreiskasse = new OrgaEinheit("Kreiskasse", kaemmerei, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit eigenbetriebMuseum = new OrgaEinheit("Eigenbetrieb Schwarzwälder Freilichtmuseum Vogtsbauernhof", dezernat1, ArtOrgaEinheit.Amt);

            OrgaEinheit eigenbetriebAbfallwirtschaft = new OrgaEinheit("Eigenbetrieb Abfallwirtschaft", dezernat1, ArtOrgaEinheit.Amt);
            OrgaEinheit nichttechnischeAbfallwirtschaft = new OrgaEinheit("Nichttechnische Abfallwirtschaft", eigenbetriebAbfallwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit abfallberatung = new OrgaEinheit("Abfallberatung", eigenbetriebAbfallwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit technischeAbfallwirtschaft = new OrgaEinheit("Technische Abfallwirtschaft", eigenbetriebAbfallwirtschaft, ArtOrgaEinheit.Sachgebiet);

            Mitarbeiter amtsleiterOrga = new Mitarbeiter(0, organisationsentwicklung, null, "Anna", "Beispiel", "0123456780", "102", "Amtsleiter Organisationsentwicklung & Zentrale Services");
            Mitarbeiter sachgebietsleiterZentraleServices1 = new Mitarbeiter(0, zentraleServices1, null, "Hans", "Beispiel", "0123456781", "103", "Sachgebietsleiter Zentrale Services I");
            Mitarbeiter sachgebietsleiterOrganisationKreistag = new Mitarbeiter(0, organisationKreistag, null, "Karl", "Beispiel", "0123456782", "104", "Sachgebietsleiter Organisation, Geschäftsstelle Kreistag & Zentraler Einkauf");
            Mitarbeiter sachgebietsleiterITServiceInfrastruktur = new Mitarbeiter(0, itServiceInfrastruktur, null, "Peter", "Beispiel", "0123456783", "105", "Sachgebietsleiter IT-Service Infrastruktur & Helpdesk");
            Mitarbeiter sachgebietsleiterITServiceDigitaleDienste = new Mitarbeiter(0, itServiceDigitaleDienste, null, "Clara", "Beispiel", "0123456784", "106", "Sachgebietsleiter IT-Service Digitale Dienste & Helpdesk");
            Mitarbeiter sachgebietsleiterDigitalisierung = new Mitarbeiter(0, digitalisierung, null, "Sophie", "Beispiel", "0123456785", "107", "Sachgebietsleiter Digitalisierung & Zentrale Services II");

            Mitarbeiter amtsleiterPersonal = new Mitarbeiter(0, personalamt, null, "Martin", "Muster", "0123456786", "108", "Amtsleiter Personalamt");
            Mitarbeiter sachgebietsleiterPersonalentwicklung = new Mitarbeiter(0, personalentwicklung, null, "Julia", "Beispiel", "0123456787", "109", "Sachgebietsleiter Personalentwicklung");
            Mitarbeiter sachgebietsleiterPersonalsachbearbeitung = new Mitarbeiter(0, personalsachbearbeitung, null, "Nina", "Beispiel", "0123456788", "110", "Sachgebietsleiter Personalsachbearbeitung");

            Mitarbeiter amtsleiterKaemmerei = new Mitarbeiter(0, kaemmerei, null, "Robert", "Beispiel", "0123456789", "111", "Amtsleiter Kämmerei und Gebäudemanagement");
            Mitarbeiter sachgebietsleiterHaushalt = new Mitarbeiter(0, haushalt, null, "Laura", "Beispiel", "0123456790", "112", "Sachgebietsleiter Haushalt, Beteiligungen, Betriebswirtschaft");
            Mitarbeiter sachgebietsleiterGebaeudemanagement = new Mitarbeiter(0, gebaeudemanagement, null, "Lukas", "Beispiel", "0123456791", "113", "Sachgebietsleiter Gebäudemanagement");
            Mitarbeiter sachgebietsleiterZentraleBeitreibung = new Mitarbeiter(0, zentraleBeitreibung, null, "Simon", "Beispiel", "0123456792", "114", "Sachgebietsleiter Zentrale Beitreibung");
            Mitarbeiter sachgebietsleiterKreiskasse = new Mitarbeiter(0, kreiskasse, null, "Erika", "Beispiel", "0123456793", "115", "Sachgebietsleiter Kreiskasse");

            Mitarbeiter amtsleiterMuseum = new Mitarbeiter(0, eigenbetriebMuseum, null, "Klaus", "Beispiel", "0123456794", "116", "Amtsleiter Eigenbetrieb Schwarzwälder Freilichtmuseum Vogtsbauernhof");

            Mitarbeiter amtsleiterAbfallwirtschaft = new Mitarbeiter(0, eigenbetriebAbfallwirtschaft, null, "Lisa", "Beispiel", "0123456795", "117", "Amtsleiter Eigenbetrieb Abfallwirtschaft");
            Mitarbeiter sachgebietsleiterNichttechnischeAbfallwirtschaft = new Mitarbeiter(0, nichttechnischeAbfallwirtschaft, null, "Tom", "Beispiel", "0123456796", "118", "Sachgebietsleiter Nichttechnische Abfallwirtschaft");
            Mitarbeiter sachgebietsleiterAbfallberatung = new Mitarbeiter(0, abfallberatung, null, "Eva", "Beispiel", "0123456797", "119", "Sachgebietsleiter Abfallberatung");
            Mitarbeiter sachgebietsleiterTechnischeAbfallwirtschaft = new Mitarbeiter(0, technischeAbfallwirtschaft, null, "Ralf", "Beispiel", "0123456798", "120", "Sachgebietsleiter Technische Abfallwirtschaft");


            OrgaEinheit baurechtsamt = new OrgaEinheit("Baurechtsamt", dezernat2, ArtOrgaEinheit.Amt);
            OrgaEinheit baurechtDenkmalschutz = new OrgaEinheit("Baurecht & Denkmalschutz", baurechtsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit bauleitplanung = new OrgaEinheit("Bauleitplanung", baurechtsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit wohnbaufoerderung = new OrgaEinheit("Wohnbauförderung", baurechtsamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit migrationsamt = new OrgaEinheit("Migrationsamt", dezernat2, ArtOrgaEinheit.Amt);
            OrgaEinheit auslaender = new OrgaEinheit("Ausländer, Staatsangehörigkeit, Standesamtsaufsicht", migrationsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit unterbringung = new OrgaEinheit("Unterbringung von Flüchtlingen & Spätaussiedlern", migrationsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit fluechtlingssozialleistungen = new OrgaEinheit("Flüchtlingssozialleistungen", migrationsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit sozialeBetreuung = new OrgaEinheit("Soziale Betreuung von Flüchtlingen", migrationsamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit strassenbauamt = new OrgaEinheit("Straßenbauamt", dezernat2, ArtOrgaEinheit.Amt);
            OrgaEinheit planungVerkehr = new OrgaEinheit("Planung & Verkehr", strassenbauamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit bauErhaltung = new OrgaEinheit("Bau & Erhaltung", strassenbauamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit betriebUnterhaltung = new OrgaEinheit("Betrieb & Unterhaltung", strassenbauamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit strassenverkehr = new OrgaEinheit("Straßenverkehr und ÖPNV", dezernat2, ArtOrgaEinheit.Amt);
            OrgaEinheit schuelerbefoerderung = new OrgaEinheit("Schülerbeförderung", strassenverkehr, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit strassenverkehrsrecht = new OrgaEinheit("Straßenverkehrsrecht & Geschwindigkeitsüberwachung", strassenverkehr, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kfzBueroOffenburg1 = new OrgaEinheit("Kfz-Bürgerbüro / Zulassung Offenburg I", strassenverkehr, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kfzBueroOffenburg2 = new OrgaEinheit("Kfz-Bürgerbüro / Zulassung Offenburg II", strassenverkehr, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kfzBueroLahr = new OrgaEinheit("Kfz-Bürgerbüro / Zulassung Lahr", strassenverkehr, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kfzBueroFuehrerschein = new OrgaEinheit("Kfz-Bürgerbüro / Führerschein", strassenverkehr, ArtOrgaEinheit.Sachgebiet);


            OrgaEinheit amtSoziales = new OrgaEinheit("Amt für Soziales und Versorgung", dezernat3, ArtOrgaEinheit.Amt);
            OrgaEinheit steuerungControllingRecht = new OrgaEinheit("Steuerung, Controlling, Recht", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit hilfeZurPflege = new OrgaEinheit("Hilfe zur Pflege, Hilfe zum Lebensunterhalt, Grundsicherung (SGB XII)", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit eingliederungshilfe = new OrgaEinheit("Leistungen der Eingliederungshilfe (SGB IX)", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit betreuungsbehoerde = new OrgaEinheit("Betreuungsbehörde", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit schwerbehindertenrecht = new OrgaEinheit("Schwerbehindertenrecht", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit sozialesEntschaedigungsrecht = new OrgaEinheit("Soziales Entschädigungsrecht", amtSoziales, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit ausbildungsfoerderung = new OrgaEinheit("Ausbildungsförderung & Wohngeld", amtSoziales, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit jugendamt = new OrgaEinheit("Jugendamt", dezernat3, ArtOrgaEinheit.Amt);
            OrgaEinheit planungSteuerungControlling = new OrgaEinheit("Planung, Steuerung, Controlling", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit beistandschaften = new OrgaEinheit("Beistandschaften", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit wirtschaftlicheJugendhilfe = new OrgaEinheit("Wirtschaftliche Jugendhilfe", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit unterhaltsvorschussleistungen = new OrgaEinheit("Unterhaltsvorschussleistungen", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit fachdienstEingliederungshilfe = new OrgaEinheit("Fachdienst Eingliederungshilfe", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kommunalerSozialerDienst = new OrgaEinheit("Kommunaler Sozialer Dienst", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit sozialpaedagogischeFamilienhilfe = new OrgaEinheit("Sozialpädagogische Familienhilfe", jugendamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit vormundschaftenPflegschaften = new OrgaEinheit("Vormundschaften/Pflegschaften", jugendamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit amtPsychDienste = new OrgaEinheit("Amt für soziale und psychologische Dienste", dezernat3, ArtOrgaEinheit.Amt);
            OrgaEinheit psychologischeBeratung = new OrgaEinheit("Psychologische Beratung", amtPsychDienste, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kommunalePraeventionsstrategie = new OrgaEinheit("Kommunale Präventionsstrategie", amtPsychDienste, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit sozialpsychiatrischeDienste = new OrgaEinheit("Sozialpsychiatrische Dienste", amtPsychDienste, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit sozialeBeratung = new OrgaEinheit("Soziale Beratung & Bürgerschaftliches Engagement", amtPsychDienste, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit amtSchuleKultur = new OrgaEinheit("Amt für Schule und Kultur", dezernat3, ArtOrgaEinheit.Amt);
            OrgaEinheit kreisschulen = new OrgaEinheit("Kreisschulen", amtSchuleKultur, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kreismedienzentrum = new OrgaEinheit("Kreismedienzentrum", amtSchuleKultur, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit volkshochschule = new OrgaEinheit("Volkshochschule Ortenau", amtSchuleKultur, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit schulsozialarbeit = new OrgaEinheit("Schulsozialarbeit", amtSchuleKultur, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit jobcenter = new OrgaEinheit("Ortenau Jobcenter", dezernat3, ArtOrgaEinheit.Amt);
            OrgaEinheit leistungsgewaehrung = new OrgaEinheit("Leistungsgewährung", jobcenter, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit arbeitsfoerderung = new OrgaEinheit("Arbeitsförderung", jobcenter, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit firmenberatungWirtschaftskontakte = new OrgaEinheit("Firmenberatung & Wirtschaftskontakte", jobcenter, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit vermessung = new OrgaEinheit("Vermessung und Flurneuordnung", dezernat4, ArtOrgaEinheit.Amt);
            OrgaEinheit liegenschaftsvermessungSued = new OrgaEinheit("Liegenschaftsvermessung Süd & Ingenieurvermessung", vermessung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit liegenschaftsvermessungNord = new OrgaEinheit("Liegenschaftsvermessung Nord & Bodenordnung", vermessung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit qualitaetssicherungVermessung = new OrgaEinheit("Qualitätssicherung Vermessung", vermessung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit liegenschaftskataster = new OrgaEinheit("Liegenschaftskataster", vermessung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit qualitaetssicherungFlurneuordnung = new OrgaEinheit("Qualitätssicherung Flurneuordnung & Rebverfahren", vermessung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit schwarzwaldverfahren = new OrgaEinheit("Schwarzwaldverfahren", vermessung, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit amtLandwirtschaft = new OrgaEinheit("Amt für Landwirtschaft", dezernat4, ArtOrgaEinheit.Amt);
            OrgaEinheit agrarstrukturLandschaftsentwicklung = new OrgaEinheit("Agrarstruktur & Landschaftsentwicklung", amtLandwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit landwirtschaftlicheUnternehmensberatung = new OrgaEinheit("Landwirtschaftliche Unternehmensberatung", amtLandwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit landwirtschaftlicheProduktion = new OrgaEinheit("Landwirtschaftliche Produktion", amtLandwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit staatlicheAusgleichsleistungen = new OrgaEinheit("Staatliche Ausgleichsleistungen", amtLandwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit ernaehrungszentrumHauswirtschaft = new OrgaEinheit("Ernährungszentrum & Hauswirtschaft", amtLandwirtschaft, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit amtWaldwirtschaft = new OrgaEinheit("Amt für Waldwirtschaft", dezernat4, ArtOrgaEinheit.Amt);
            OrgaEinheit innereOrganisation = new OrgaEinheit("Innere Organisation, Haushalt und Förderung", amtWaldwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit forstrechtWaldnaturschutz = new OrgaEinheit("Forstrecht, Waldnaturschutz und Umweltbildung", amtWaldwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit beratungBetreuung = new OrgaEinheit("Beratung und Betreuung Privat-/Kommunalwald", amtWaldwirtschaft, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit ordnungsamt = new OrgaEinheit("Ordnungsamt", dezernat5, ArtOrgaEinheit.Amt);
            OrgaEinheit zentraleBussgeldstelle = new OrgaEinheit("Zentrale Bußgeldstelle", ordnungsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit heimaufsichtGewerbe = new OrgaEinheit("Heimaufsicht & Gewerbe", ordnungsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit jagdWaffenSprengstoff = new OrgaEinheit("Jagd, Waffen & Sprengstoff", ordnungsamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit gesundheitsamt = new OrgaEinheit("Gesundheitsamt", dezernat5, ArtOrgaEinheit.Amt);
            OrgaEinheit umweltInfektionshygiene = new OrgaEinheit("Umwelt- & Infektionshygiene", gesundheitsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kinderJugendaerztlicherDienst = new OrgaEinheit("Kinder- & Jugendärztlicher Dienst", gesundheitsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit amtsVersorgungsdienst = new OrgaEinheit("Amts- & Versorgungsärztlicher Dienst, Medizinische Prävention", gesundheitsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit zahnaerztlicherDienst = new OrgaEinheit("Zahnärztlicher Dienst", gesundheitsamt, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit klinikhygienePandemiemanagement = new OrgaEinheit("Klinikhygiene und Pandemie-Management", gesundheitsamt, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit veterinärwesen = new OrgaEinheit("Amt für Veterinärwesen und Lebensmittelüberwachung", dezernat5, ArtOrgaEinheit.Amt);
            OrgaEinheit amtstieraerztlicherDienst = new OrgaEinheit("Amtstierärztlicher Dienst", veterinärwesen, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit verwaltungLebensmittelkontrolle = new OrgaEinheit("Verwaltung, Lebensmittelkontrolle", veterinärwesen, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit bkschutz = new OrgaEinheit("Amt für Brand- und Katastrophenschutz", dezernat5, ArtOrgaEinheit.Amt);
            OrgaEinheit katastrophenschutzKrisenmanagement = new OrgaEinheit("Katastrophenschutz & Krisenmanagement", bkschutz, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit brandschutz = new OrgaEinheit("Brandschutz", bkschutz, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit rechnungspruefung = new OrgaEinheit("Kommunal- und Rechnungsprüfungsamt", dezernat6, ArtOrgaEinheit.Amt);
            OrgaEinheit kommunalaufsicht = new OrgaEinheit("Kommunalaufsicht über Gemeinden, Stiftungen und Zweckverbände", rechnungspruefung, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit rechnungspruefungsamt = new OrgaEinheit("Rechnungsprüfungsamt", rechnungspruefung, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit gewerbeaufsicht = new OrgaEinheit("Amt für Gewerbeaufsicht, Immissionsschutz und Abfallrecht", dezernat6, ArtOrgaEinheit.Amt);
            OrgaEinheit immissionsschutz = new OrgaEinheit("Immissionsschutz, Abfallrecht, Lagerung wassergefährdender Stoffe", gewerbeaufsicht, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit gewerbeaufsichtBranchen1 = new OrgaEinheit("Gewerbeaufsicht – Branchen 1", gewerbeaufsicht, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit gewerbeaufsichtBranchen2 = new OrgaEinheit("Gewerbeaufsicht – Branchen 2", gewerbeaufsicht, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit umweltschutz = new OrgaEinheit("Amt für Umweltschutz", dezernat6, ArtOrgaEinheit.Amt);
            OrgaEinheit wasserrecht = new OrgaEinheit("Wasserrecht", umweltschutz, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit naturschutz = new OrgaEinheit("Naturschutz", umweltschutz, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit bodenschutzrecht = new OrgaEinheit("Bodenschutzrecht", umweltschutz, ArtOrgaEinheit.Sachgebiet);

            OrgaEinheit wasserwirtschaft = new OrgaEinheit("Amt für Wasserwirtschaft und Bodenschutz", dezernat6, ArtOrgaEinheit.Amt);
            OrgaEinheit gewaesser = new OrgaEinheit("Gewässer", wasserwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit wasserversorgung = new OrgaEinheit("Wasserversorgung, Trinkwasserüberwachung, Grundwasserschutz", wasserwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit kommunalesAbwasser = new OrgaEinheit("Kommunales Abwasser", wasserwirtschaft, ArtOrgaEinheit.Sachgebiet);
            OrgaEinheit altlastenBodenschutzAbfall = new OrgaEinheit("Altlasten, Bodenschutz, Abfall", wasserwirtschaft, ArtOrgaEinheit.Sachgebiet);


            orgaEinheitRepo.saveAll(List.of(
                    dezernat1, dezernat2, dezernat3, dezernat4, dezernat5, dezernat6,
                    organisationsentwicklung, zentraleServices1, organisationKreistag, itServiceInfrastruktur, itServiceDigitaleDienste, digitalisierung,
                    personalamt, personalentwicklung, personalsachbearbeitung,
                    kaemmerei, haushalt, gebaeudemanagement, zentraleBeitreibung, kreiskasse,
                    eigenbetriebMuseum, eigenbetriebAbfallwirtschaft, nichttechnischeAbfallwirtschaft, abfallberatung, technischeAbfallwirtschaft,
                    baurechtsamt, baurechtDenkmalschutz, bauleitplanung, wohnbaufoerderung,
                    migrationsamt, auslaender, unterbringung, fluechtlingssozialleistungen, sozialeBetreuung,
                    strassenbauamt, planungVerkehr, bauErhaltung, betriebUnterhaltung,
                    strassenverkehr, schuelerbefoerderung, strassenverkehrsrecht, kfzBueroOffenburg1, kfzBueroOffenburg2, kfzBueroLahr, kfzBueroFuehrerschein,
                    amtSoziales, steuerungControllingRecht, hilfeZurPflege, eingliederungshilfe, betreuungsbehoerde, schwerbehindertenrecht, sozialesEntschaedigungsrecht, ausbildungsfoerderung,
                    jugendamt, planungSteuerungControlling, beistandschaften, wirtschaftlicheJugendhilfe, unterhaltsvorschussleistungen, fachdienstEingliederungshilfe, kommunalerSozialerDienst, sozialpaedagogischeFamilienhilfe, vormundschaftenPflegschaften,
                    amtPsychDienste, psychologischeBeratung, kommunalePraeventionsstrategie, sozialpsychiatrischeDienste, sozialeBeratung,
                    amtSchuleKultur, kreisschulen, kreismedienzentrum, volkshochschule, schulsozialarbeit,
                    jobcenter, leistungsgewaehrung, arbeitsfoerderung, firmenberatungWirtschaftskontakte,
                    vermessung, liegenschaftsvermessungSued, liegenschaftsvermessungNord, qualitaetssicherungVermessung, liegenschaftskataster, qualitaetssicherungFlurneuordnung, schwarzwaldverfahren,
                    amtLandwirtschaft, agrarstrukturLandschaftsentwicklung, landwirtschaftlicheUnternehmensberatung, landwirtschaftlicheProduktion, staatlicheAusgleichsleistungen, ernaehrungszentrumHauswirtschaft,
                    amtWaldwirtschaft, innereOrganisation, forstrechtWaldnaturschutz, beratungBetreuung,
                    ordnungsamt, zentraleBussgeldstelle, heimaufsichtGewerbe, jagdWaffenSprengstoff,
                    gesundheitsamt, umweltInfektionshygiene, kinderJugendaerztlicherDienst, amtsVersorgungsdienst, zahnaerztlicherDienst, klinikhygienePandemiemanagement,
                    veterinärwesen, amtstieraerztlicherDienst, verwaltungLebensmittelkontrolle,
                    bkschutz, katastrophenschutzKrisenmanagement, brandschutz,
                    rechnungspruefung, kommunalaufsicht, rechnungspruefungsamt,
                    gewerbeaufsicht, immissionsschutz, gewerbeaufsichtBranchen1, gewerbeaufsichtBranchen2,
                    umweltschutz, wasserrecht, naturschutz, bodenschutzrecht,
                    wasserwirtschaft, gewaesser, wasserversorgung, kommunalesAbwasser, altlastenBodenschutzAbfall
            ));
            mitarbeiterRepo.saveAll(List.of(dezernent1, dezernent2, dezernent3, dezernent4, dezernent5, dezernent6,
                    amtsleiterOrga, sachgebietsleiterZentraleServices1, sachgebietsleiterOrganisationKreistag, sachgebietsleiterITServiceInfrastruktur, sachgebietsleiterITServiceDigitaleDienste, sachgebietsleiterDigitalisierung,
                    amtsleiterPersonal, sachgebietsleiterPersonalentwicklung, sachgebietsleiterPersonalsachbearbeitung,
                    amtsleiterKaemmerei, sachgebietsleiterHaushalt, sachgebietsleiterGebaeudemanagement, sachgebietsleiterZentraleBeitreibung, sachgebietsleiterKreiskasse,
                    amtsleiterMuseum,
                    amtsleiterAbfallwirtschaft, sachgebietsleiterNichttechnischeAbfallwirtschaft, sachgebietsleiterAbfallberatung, sachgebietsleiterTechnischeAbfallwirtschaft
            ));
        };
    }
}
