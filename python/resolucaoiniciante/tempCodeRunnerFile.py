A = float(input())
B = float(input())
C = float(input())

triangulo = (A * C) / 2
circulo = 3.14159 * (C*C)
trapezio = ((A + B) * C) / 2
quadrado = B * B
retangulo = A * B

print(f"TRIANGULO: {triangulo:.3f}\n"
      f"CIRCULO: {circulo:.3f}\n"
      f"TRAPEZIO: {trapezio:.3f}\n"
      f"QUADRADO: {quadrado:.3f}\n"
      f"RETANGULO: {retangulo:.3f}")