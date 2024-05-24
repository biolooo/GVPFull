package com.lra.GVP.Service;

import com.lra.GVP.Model.Mitarbeiter;
import com.lra.GVP.Model.OrgaEinheit;
import com.lra.GVP.Repo.MitarbeiterRepo;
import com.lra.GVP.Repo.OrgaEinheitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
public class GvpService {

    private final OrgaEinheitRepo orgaEinheitRepo;
    private final MitarbeiterRepo mitarbeiterRepo;
    @Autowired
    private GvpService(OrgaEinheitRepo orgaEinheitRepo, MitarbeiterRepo mitarbeiterRepo){
        this.orgaEinheitRepo = orgaEinheitRepo;
        this.mitarbeiterRepo = mitarbeiterRepo;
    }

    //Get/Add Mitarbeiter/OrgaEinheit
    public List<OrgaEinheit> getOrgaEinheit() {
        return orgaEinheitRepo.findAll();
    }
    public OrgaEinheit addOrgaEinheit(OrgaEinheit orgaEinheit) {
        return orgaEinheitRepo.save(orgaEinheit);
    }


    public List<Mitarbeiter> getMitarbeiter() {
        return mitarbeiterRepo.findAll();
    }
    public Mitarbeiter addMitarbeiter(Mitarbeiter mitarbeiter) {
        return mitarbeiterRepo.save(mitarbeiter);
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Update OrgaEinheit / Mitarbeiter
    public OrgaEinheit updateOrgaEinheit(OrgaEinheit orgaEinheit, long orgaEinheitID) {
        OrgaEinheit existingOrgaEinheit = orgaEinheitRepo.findById(orgaEinheitID).orElseThrow(() -> new RuntimeException("OrgaEinheit not found"));
        return orgaEinheitRepo.save((OrgaEinheit)update(orgaEinheit, existingOrgaEinheit));
    }

    public Mitarbeiter updateMitarbeiter(Mitarbeiter mitarbeiter, long mitarbeiterID) {
        Mitarbeiter existingMitarbeiter = mitarbeiterRepo.findById(mitarbeiterID).orElseThrow(() -> new RuntimeException("Mitarbeiter not found"));
        return mitarbeiterRepo.save((Mitarbeiter) update(mitarbeiter, existingMitarbeiter));
    }

    public Object update(Object obj, Object existingObj){
        Field[] fields = OrgaEinheit.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                if (value != null) {
                    field.set(existingObj, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return existingObj;
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------

}
