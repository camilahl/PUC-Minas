 main:
    addi t0, zero, 4   # escolhe a operacao de leitura de inteiro (4)
    ecall              # efetua a operacao de leitura de inteiro
    # digita um numero que e salvo no a0
    addi  a0, a0, 2    # t2 = a0 + 2
    ret
