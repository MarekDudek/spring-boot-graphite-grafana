package md.springbootgraphitegrafana.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController
{

    @Autowired
    private PersonService personService;

    @GetMapping()
    public Person getPerson(@RequestParam String id)
    {
        Person person = personService.getPerson(id);
        return person;
    }

}