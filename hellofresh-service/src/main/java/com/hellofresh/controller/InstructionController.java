package com.hellofresh.controller;

import com.hellofresh.entity.Instruction;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructions")
public class InstructionController {

    @Autowired
    private InstructionService instructionsService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<Instruction> Instructions) {
        instructionsService.add(Instructions);
        return new ResponseMessage("Instructions added");
    }
    @GetMapping(value = "/{id}")
    public Instruction get(@PathVariable("id") long id) {
        return instructionsService.get(id);
    }

    @GetMapping
    public List<Instruction> getAll() {
        return instructionsService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        instructionsService.delete(id);
        return new ResponseMessage("Instruction deleted");
    }

}
