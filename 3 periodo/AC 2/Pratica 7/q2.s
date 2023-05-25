# I = 73, P = 80
main:
    # ler um caracter do teclado
    addi t0, zero, 5
    ecall # salva no a0

    # a0 and 1
    andi t1, a0, 1

    # se t1 = zero entao eh par
    beq t1, zero, par

    # printar letra I
    add a0, zero, 73
    addi t0, zero, 2
    ecall

    # se for impar pula pro fim pra nao passar pelo par
    j FIM
par:
    # printar letra P
    add a0, zero, 80
    addi t0, zero, 2
    ecall
FIM:
    ret