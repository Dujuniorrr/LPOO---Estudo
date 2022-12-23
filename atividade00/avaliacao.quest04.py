vetorA = {2, 3, 4, 5, 6, 4, 3, 5, 6, 7, 8, 96, 1, 100, 6, 4, 6, 8, 5, 10}
menor = 0

for x in range (0, 20):
     if vetorA[x] < menor:
         menor = vetorA[x]
         posicao = x
     
print("menor numero: " + menor + " posicao: " + posicao)