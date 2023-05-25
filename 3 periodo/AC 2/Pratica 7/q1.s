main:
    # ler um caracter do teclado
    addi t0, zero, 5
    ecall

    # t0 = a0 + 32
    addi a0, a0 32      

    # escrever um caractere na tela
    addi t0, zero, 2
    ecall
    ret