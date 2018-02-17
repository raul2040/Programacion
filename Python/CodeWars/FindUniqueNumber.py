def find_uniq(arr):
    lista_nueva = []
    for i in arr:
         if i not in lista_nueva:
             lista_nueva.append(i)
    print(lista_nueva)


if __name__ == "__main__":
    testCase = [ 1, 1, 1, 2, 1, 1 ]
    assert find_uniq(testCase) == 2 , "hemos fallado en el primer caso test"
    testCase = [ 0, 0, 0.55, 0, 0 ]
    assert find_uniq(testCase) == 0.55 , "hemos fallado el segundo caso test"
    testCase = [ 3, 10, 3, 3, 3 ]
    assert find_uniq(testCase) == 10 , "hemos fallado el tercer caso test"

print (find_uniq(testCase))
