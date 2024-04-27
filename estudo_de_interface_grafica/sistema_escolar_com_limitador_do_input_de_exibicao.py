import customtkinter as ctk
from tkinter import *
from tkinter import messagebox


#funções------------------------------------------------------------------------------------------------------------------------------------------------------------------------
def Calcular_Media():
    uni1 = float(nota1.get())
    uni2 = float(nota2.get())
    uni3 = float(nota3.get())
    
    media = (uni1+uni2+uni3)/3
    if(media >= 7):
        resultado.insert(0,f'O aluno está aprovado com média final de {media:.1f}')
        resultado.configure(text_color='green')
        resultado.configure(state ='disabled')
    else:
        resultado.insert(0,f'O aluno está reprovado e ficou com média final de {media:.1f}')
        resultado.configure(text_color='red')
        resultado.configure(state ='disabled')
        

def Limpar():
    nota1.delete(0,'end')
    nota2.delete(0,'end')
    nota3.delete(0,'end')
    resultado.delete(0,'end')    
#------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


#janela
ctk.set_appearance_mode('dark')

janela = ctk.CTk('Grey')
janela.geometry('500x400')
janela.title('Sistema Escolar V1.0')
ctk.CTkLabel(janela, text='Sistema Escolar V1.0',font=('Arial',21,'bold'),text_color='white').pack(pady=10)

ctk.CTkLabel(janela,text='1º unidade:',font=('Arial',13,'bold'),text_color='white').place(x=102,y=50)
nota1 = ctk.CTkEntry(janela,placeholder_text='Digite a nota da 1º unidade',width=300)
nota1.pack(pady=10)


ctk.CTkLabel(janela,text='2º unidade:',font=('Arial',13,'bold'),text_color='white').place(x=102,y=120)
nota2 = ctk.CTkEntry(janela,placeholder_text='Digite a nota da 2º unidade',width=300)
nota2.pack(pady=30)


ctk.CTkLabel(janela,text='3º unidade:',font=('Arial',13,'bold'),text_color='white').place(x=102,y=190)
nota3 = ctk.CTkEntry(janela,placeholder_text='Digite a nota da 3º unidade',width=300)
nota3.pack(pady=12)

botao = ctk.CTkButton(janela,text='CALCULAR',text_color='white',width=80,fg_color='darkred',border_color='white',border_width=1, cursor='pirate',command=Calcular_Media)
botao.pack(pady = 5)

botao_limpar = ctk.CTkButton(janela,text='LIMPAR',text_color='white',width=80,fg_color='darkred',border_color='white',border_width=1, cursor='pirate',command=Limpar)
botao_limpar.pack(pady = 5)

resultado = ctk.CTkEntry(janela,width=350)
resultado.pack(pady=30)



janela.mainloop()