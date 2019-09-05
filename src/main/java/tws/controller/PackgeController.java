package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Packge;
import tws.repository.PackgeMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packge")
@CrossOrigin
public class PackgeController {

    @Autowired
    private PackgeMapper packgeMapper;

    @GetMapping("")
    public ResponseEntity<List<Packge>> getAll() {
        return ResponseEntity.ok(packgeMapper.selectAll());
    }



    @PostMapping("")
    public ResponseEntity<Packge> insert(@RequestBody Packge packge) {
        packgeMapper.insert(packge);
        return ResponseEntity.created(URI.create("/packge/" + packge.getId())).body(packge);
    }
}
