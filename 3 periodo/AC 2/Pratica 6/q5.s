main:
    addi t0, zero, 4    # escolhe a operação de leitura de inteiro (4)
    ecall               # efetua a operação de leitura de inteiro
    add s0, a0, zero    # guarda o valor retornado em a0 em s0
    addi t0, zero, 4    # escolhe a operação de leitura de inteiro (4)
    ecall               # efetua a operação de leitura de inteiro
    add a0, s0, a0      # a0 = a0 + s0
    addi t0, zero, 1    # escolhe a operação de escrita de inteiro (1)
    ecall               # efetua a operação de escrita de inteiro
    ret
