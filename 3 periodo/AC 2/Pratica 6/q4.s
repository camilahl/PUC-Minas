 main:
    # leitura
    addi t0, zero, 4   # escolhe a operacao de leitura de inteiro (4)
    ecall              # efetua a operacao de leitura de inteiro
    # digita um numero que e salvo no a0
    addi  a0, a0, 4    # t2 = a0 + 4
    # mostrar na tela (a0)
    addi t0, zero, 1   # escolhe a operacao de escrita de inteiro (1)
    ecall              # efetua a operacao de escrita de inteiro
    ret
