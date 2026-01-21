def mod_exp(a,m,p):
    result=(a**m)%p
    return result
a,m,p=map(int,input("Enter a,m,p: ").split())
print(mod_exp(a,m,p))