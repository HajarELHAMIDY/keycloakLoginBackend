package analytix.inforisk.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping(value = "/analytix/authenticate")
public class DemoController {

 
   

    @ResponseBody
    @GetMapping(value = "/EspaceClient")
    public void getAdmin(Principal principal) {
   	 System.out.println("get Ressource Abonne");
       
    }

   

    private String logPrincipal(Principal principal) {
        Collection<SimpleGrantedAuthority> authorities =
                (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        System.out.println(authorities);
        System.out.println(principal);
        return principal.getName() + " " + authorities.toString();
    }
}
