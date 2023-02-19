package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/roles")
public class AppRoleController {
    private AppRoleRepository appRoleRepository;
    @PostMapping(path = "/save")
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }
    @GetMapping(path = "/login")
    public AppRoleEntity login(@RequestParam  String id){
        return appRoleRepository.findById(Integer.parseInt(id));
    }
}
