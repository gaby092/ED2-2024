import requests

def obter_cidades_ordenadas_por_nome():
    url = "https://servicodados.ibge.gov.br/api/v1/localidades/municipios"
    response = requests.get(url)
    if response.status_code == 200:
        cidades = response.json()
        cidades_ordenadas = sorted(cidades, key=lambda cidade: cidade['nome'])
        return cidades_ordenadas
    else:
        print("Erro ao obter cidades:", response.status_code)

def obter_cidades_por_estado(estado):
    url = f"https://servicodados.ibge.gov.br/api/v1/localidades/estados/{estado}/municipios"
    response = requests.get(url)
    if response.status_code == 200:
        cidades = response.json()
        cidades_ordenadas = sorted(cidades, key=lambda cidade: cidade['nome'])
        return cidades_ordenadas
    else:
        print("Erro ao obter cidades por estado:", response.status_code)

# Obtendo e exibindo cidades ordenadas por nome para o Brasil inteiro
print("Cidades do Brasil ordenadas por nome:")
cidades_brasil = obter_cidades_ordenadas_por_nome()
for cidade in cidades_brasil[:10]:  # Exibindo apenas as primeiras 10 cidades como exemplo
    print(cidade['nome'])

# Obtendo e exibindo cidades do estado de São Paulo ordenadas por nome
print("\nCidades do estado de São Paulo ordenadas por nome:")
cidades_sp = obter_cidades_por_estado("SP")
for cidade in cidades_sp[:10]:  # Exibindo apenas as primeiras 10 cidades como exemplo
    print(cidade['nome'])

# Obtendo e exibindo cidades do estado do Rio de Janeiro ordenadas por nome
print("\nCidades do estado do Rio de Janeiro ordenadas por nome:")
cidades_rj = obter_cidades_por_estado("RJ")
for cidade in cidades_rj[:10]:  # Exibindo apenas as primeiras 10 cidades como exemplo
    print(cidade['nome'])
