main:
    addi s0, zero, 0
    addi s1, zero, 0

    loop:
    # ler um caracter do teclado
    addi t0, zero, 5
    ecall # salva no a0

    # Se o valor lido for igual a zero, fim
    beq s0, zero, FIM

    # a0 and 1
    andi t1, a0, 1

    # se t1 = zero entao eh par
    beq t1, zero, somapar

    somapar:
    add s0, s0, a0

    j loop

    somaimpar:
    add s1, s1, a0
    j loop

FIM:
    # s2 = s1 - s0
    sub s2, s1, s0

    # escrever um caractere na tela
    # caracter tem que tá no a0
    addi a0, zero, s2 
    addi t0, zero, 2
    ecall
    ret