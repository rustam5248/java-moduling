module jmp.application{

    requires jmp.bank.api;
    requires jmp.cloud.bank.impl;
    requires jmp.cloud.service.impl;
    requires jmp.dto;
    requires jmp.service.api;

    exports jmp.application;
}