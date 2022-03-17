flag = 0

for a in range(3):
    if flag == 1:
        break
        
    for b in range(0, 9, 2):
        if flag == 1:
            break
            
        for c in range(a+1, a+4):
            if b != 0:
                print(f'I={a}.{b} J={c}.{b}')
            else:
                print(f'I={a} J={c}')
                
            if a == 2 and b == 0 and c == 5:
                flag = 1
