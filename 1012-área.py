valores = input().split()

a, b, c = valores

pi = 3.14159

tri = float(a)*float(c)/2
cir = pi*float(c)**2
tra = (float(a)+float(b))*float(c)/2
qua = float(b)**2
ret = float(a)*float(b)

print(f"TRIANGULO: {tri:.3f}")
print(f"CIRCULO: {cir:.3f}")
print(f"TRAPEZIO: {tra:.3f}")
print(f"QUADRADO: {qua:.3f}")
print(f"RETANGULO: {ret:.3f}")
