package com.hellofresh.service.impl;

import com.hellofresh.entity.Instruction;
import com.hellofresh.repository.InstructionRepository;
import com.hellofresh.service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructionServiceImpl implements InstructionService {

    @Autowired
    private InstructionRepository repository;

    @Override
    public void add(List<Instruction> instructions) {
        repository.saveAll(instructions);
    }

    @Override
    public List<Instruction> get() {
        return repository.findAll();
    }

    @Override
    public Instruction get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
