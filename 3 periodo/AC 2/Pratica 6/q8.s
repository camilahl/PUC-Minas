main:
    # Le um numero do teclado e armazena em a0
    addi t0, zero, 4    
    ecall               # efetua a operação de leitura de inteiro (escreve numero)
    add s0, a0, zero    # guarda o valor retornado em a0 em s0

    # Soma 2 ao valor de a0
    addi  a0, a0, 2    # t2 = a0 + 2

    # Se o valor lido for igual a zero, return
    beq s0, zero, FIM

    # Imprima o valor de a0 na tela
    addi t0, zero, 1   # escolhe a operacao de escrita de inteiro (1)
    ecall              # efetua a operacao de escrita de inteiro
    j main
FIM:
    ret