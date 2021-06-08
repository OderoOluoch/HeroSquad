import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class App {
    public static void main(String[] args) {
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //Url for hero list
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.getAll();
            model.put("heroes", heroes);
            return new ModelAndView(model, "heroList.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show new post form
        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "heroForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (req, res) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();

            String name = req.queryParams("content");
            int age = Integer.parseInt(req.queryParams("age"));

//            Hero newHero = new Hero(name,age,);
//            model.put("hero", newHero);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



        //Url for squad list
        get("/squads", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "squadList.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show new squad form
        get("/squads/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squadForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads/new", (req, res) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();

            String name = req.queryParams("content");
            int age = Integer.parseInt(req.queryParams("age"));

//           Squad newSquad = new Squad();
//            model.put("hero", newSquad);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
