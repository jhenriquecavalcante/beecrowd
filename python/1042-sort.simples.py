x, y, z = map(int,input().split())

menor = min(x, y, z)
maior = max(x, y, z)
medio = (x + y + z) - maior - menor

print(f"{menor}\n{medio}\n{maior}\n")
print(f"{x}\n{y}\n{z}")
