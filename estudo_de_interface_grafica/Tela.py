#comando para importar a biblioteca CUMTOMTINKER, o comando AS serve para atribuir uma apelido para a biblioteca
import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

def Calcular():
    dist = int(distancia.get())
    cons = int(consumo.get())
    prec = float(preco_do_combustivel.get())

    total = (dist/cons)*prec

    messagebox.showinfo("Resultado:", f'O gasto da viagem será de R${total:.2f}')


ctk.set_appearance_mode('light') #comando para definir o modo dark na janela


janela = ctk.CTk('#E6E6FA') #comando para criar e definir a cor da janela
janela.geometry('500x300') #comando para definir o tamanho da janela

janela.title('Calculadora de consumo') #comando para definir o titulo da janela

#comando para criar o titulo principal da janela, passando a fonte, tamanho, cor do texto e distancia da linha de limite superior da tela(comando pack(pady))
ctk.CTkLabel(janela,text='Viagem x Consumo',font=('Arial',21,'bold'),text_color='#1C1C1C').pack(pady=6)


ctk.CTkLabel(janela,text='Distância (KM)',font=('Arial',13,'bold'),text_color='#1C1C1C').pack(pady=3) #mesmo comando para criar o titulo principal, porém esse cria o nome LOGIN
#comando para criar a caixa de login, que vai receber o dado do usuario. o placeholder é o nome que aparece na caixa informando o que o usuario precisa digitar
distancia = ctk.CTkEntry(janela,placeholder_text='Digite a distância que será percorrida',width=400)
distancia.pack()

ctk.CTkLabel(janela,text='Consumo (L)',font=('Arial',13,'bold'),text_color='#1C1C1C').pack(pady=3)
consumo = ctk.CTkEntry(janela,placeholder_text='Digite o consumo médio do seu veículo',width=400) #o comando SHOW serve para ocultar o que esta sendo escrito na caixa
consumo.pack()

ctk.CTkLabel(janela,text='Preço do combustível (R$)', font=('Arial',13,'bold'),text_color= '#1C1C1C').pack(pady=3)
preco_do_combustivel = ctk.CTkEntry(janela,placeholder_text='Digite o preço do combustivel a sua cidade',width=400)
preco_do_combustivel.pack()

#comando para criar um botão, definindo o tamanho da caixa WIDTH, a cor do botão FG_COLOR, a borda BORDER_COLOR e a grossura da borda BORDER_WIDTH
botao = ctk.CTkButton(janela, text= 'CALCULAR', width= 100, fg_color= 'red', border_color= 'black', border_width=1,command=Calcular)
botao.pack(pady = 15)



janela.mainloop()