package com.hellofresh.service;

import com.hellofresh.entity.Instruction;

import java.util.List;

public interface InstructionService {
    void add(List<Instruction> ingredients);

    List<Instruction> get();

    Instruction get(long id);

    void delete(long id);
}
