item, quantidade = map(int,input().split())

if item == 1:
    preco = quantidade*4
    print(f"Total: R$ {preco:.2f}")
elif item == 2:
    preco = quantidade*4.5
    print(f"Total: R$ {preco:.2f}")
elif item == 3:
    preco = quantidade*5
    print(f"Total: R$ {preco:.2f}")
elif item == 4:
    preco = quantidade*2
    print(f"Total: R$ {preco:.2f}")
elif item == 5:
    preco = quantidade*1.5
    print(f"Total: R$ {preco:.2f}")
