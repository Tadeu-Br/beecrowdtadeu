entradas = input("")
A, B, C, D = map(int, entradas.split())

if B > C:
  
    if D > A:
        
        sum1 = C + D
        sum2 = A + B
        if sum1 > sum2:
          
            if C > 0 and D > 0:

                if A % 2 == 0:
                
                    print ("Valores aceitos")
                else:
                    print ("Valores nao aceitos")
            else:
                print ("Valores nao aceitos")
        else:
            print ("Valores nao aceitos")
    else:
        print ("Valores nao aceitos")
else:
    print ("Valores nao aceitos")