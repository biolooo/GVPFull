package com.lra.GVP.Controller;

import com.lra.GVP.Model.Mitarbeiter;
import com.lra.GVP.Model.OrgaEinheit;
import com.lra.GVP.Service.GvpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class Controller {
    private final GvpService gvpService;
    @Autowired
    public Controller(GvpService gvpService) {this.gvpService = gvpService;}

    @GetMapping("/getOrgaEinheit")
    public ResponseEntity<List<OrgaEinheit>> getOrgaEinheit(){
        return new ResponseEntity<>(gvpService.getOrgaEinheit(), HttpStatus.OK);
    }

    @PostMapping("/addOrgaEinheit")
    public ResponseEntity<OrgaEinheit> addOrgaEinheit(@RequestBody OrgaEinheit orgaEinheit){
        return new ResponseEntity<>(gvpService.addOrgaEinheit(orgaEinheit), HttpStatus.CREATED);
    }

    @PatchMapping("/{orgaEinheitID}")
    public ResponseEntity<OrgaEinheit> updateOrgaEinheit(@PathVariable long orgaEinheitID, @RequestBody OrgaEinheit orgaEinheit){
        return new ResponseEntity<>(gvpService.updateOrgaEinheit(orgaEinheit, orgaEinheitID), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getMitarbeiter")
    public ResponseEntity<List<Mitarbeiter>> getMitarbeiter(){
        return new ResponseEntity<>(gvpService.getMitarbeiter(), HttpStatus.OK);
    }

    @PostMapping("/addMitarbeiter")
    public ResponseEntity<Mitarbeiter> addMitarbeiter(@RequestBody Mitarbeiter mitarbeiter){
        return new ResponseEntity<>(gvpService.addMitarbeiter(mitarbeiter), HttpStatus.CREATED);
    }

    @PatchMapping("/{mitarbeiterID}")
    public ResponseEntity<Mitarbeiter> updateMitarbeiter(@PathVariable long mitarbeiterID, @RequestBody Mitarbeiter mitarbeiter){
        return new ResponseEntity<>(gvpService.updateMitarbeiter(mitarbeiter, mitarbeiterID), HttpStatus.ACCEPTED);
    }

}
