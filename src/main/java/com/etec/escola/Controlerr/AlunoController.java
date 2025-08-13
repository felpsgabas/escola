package com.etec.escola.Controlerr;

import com.etec.escola.Service.AlunoService;

public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
}
