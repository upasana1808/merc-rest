package com.example.controller;
import com.example.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // it expos)es data and service in the form of JSON/XML
@RequestMapping("/laptop1")
@CrossOrigin("*")
public class LaptopController1 {
    List<Laptop> list=new ArrayList<>();
    public LaptopController1()
    {
        list.add(new Laptop(1,"SONY",1000,32));
    }
    //@RequestMapping("/list")
    //@RequestMapping(value="/list" , method=RequestMethod.GET)
    @GetMapping("/list")
    public List<Laptop> list()
    {
        return list;
    }
    @GetMapping("/findOne/{index}")
    public Laptop findOne(@PathVariable int index)
    {
       return list.get(index);
    }
    @PostMapping("/add")
    public void add(@RequestBody Laptop lp)
    {
        //list.add("Surya");
        list.add(lp);
    }
    @PutMapping("/update/{index}")
    public void update(@PathVariable int index,@RequestBody Laptop lp)
    {
        list.set(index,lp);
    }
    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index)
    {
        list.remove(index);
    }




}
