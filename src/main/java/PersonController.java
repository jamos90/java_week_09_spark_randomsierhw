import spark.staticfiles.StaticFilesFolder;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;

import static spark.Spark.staticFileLocation;

public class PersonController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("James",28,"Coder");
        Person person2 = new Person("Jess",28,"Graphic Designer");
        Person person3 = new Person("Morag",54,"Doctor");
        Person person4 = new Person("David",54,"Consultant");
        Person person5 = new Person("Kate",24,"Public Servent");
        Person person6 = new Person("Joe",20,"Student");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);

    }
}
