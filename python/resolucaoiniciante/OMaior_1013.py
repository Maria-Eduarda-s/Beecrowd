"""
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
Utilize a fórmula:



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para 
chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
"""

a, b, c = map(int, input().split())

maiorAB = (a + b + abs(a - b)) // 2
maior = (maiorAB + c + abs(maiorAB - c)) // 2  

print(f"{maior} eh o maior")