ledoisnum:
# funcao lê dois numeros nao chama nenhuma funcao entao so executa
    addi t0, zero, 4
    ecall
    add a1, zero, a0 # primeiro numero digitado salvou no a0 e foi pro a1
    addi t0, zero, 4
    ecall
    ret
    # retorna numeros no registrador a0 e a1

somadois:
    # decrementa em 4(cada palavra eh 4 bitd) o sp, que eh uma pilha
    addi sp, sp, -4
    sw ra, 0(sp)
    # chama funcao
    call ledoisnum
    add a0, a0, a1 # soma o que ta em a0 + a1 e retorna resultado
    # 
    lw ra, 0(sp)
    addi sp, sp, 4
    ret

main:
    # decrementa em 4(cada palavra eh 4 bitd) o sp, que eh uma pilha
    addi sp, sp, -4
    sw ra, 0(sp)
    # chama funcao e mostra resultado
    call somadois # recebe resultado do somatorio
    # mostra resultado na tela (seta t0 para 0)
    addi t0, zero, 1
    ecall
    # 
    lw ra, 0(sp)
    addi sp, sp, 4
    ret