import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

#funcoes
def Calcular():
    uni1 = float(nota1.get())
    uni2 = float(nota2.get())
    uni3 = float(nota3.get())
    name = nome.get()

    media = (uni1+uni2+uni3)/3
    if(media >= 7):
        messagebox.showinfo('Nota final', f'O aluno {name} está aprovado com média {media:.1f}')
        "resultado.insert(0, f'O aluno {name} está aprovado com média {media:.1f}')"
        "resultado.configure(text_collor='green')"
    else:
        messagebox.showinfo('Nota final', f'O aluno ficou com média {media:.1f} e está em recuperação')
        "resultado.insert(0, f'O aluno {name} ficou com média {media:.1f} e está em recuperação')"
        "resultado.configure(text_collor='red')"

def Limpar():
    nome.delete(0, 'end')
    nota1.delete(0, 'end')
    nota2.delete(0, 'end')
    nota3.delete(0, 'end')
    #resultado.delete(0, 'end')

#-----------------------------------------------------------------------------------------------------------------------

#Funcionalidades da tela
ctk.set_appearance_mode('dark')
janela = ctk.CTk('pink')
janela.title('Calculadora de nota V1.0')
janela.maxsize(330, 300)
janela.minsize(330, 300)

ctk.CTkLabel(janela, text='NOTA FINAL', font=('Times', 21, 'bold'), text_color='black').pack(pady=10)
nome = ctk.CTkEntry(janela, placeholder_text='Digite o nome do aluno', width=250)
nome.pack(pady=10)

nota1 = ctk.CTkEntry(janela, placeholder_text='Digite a nota da 1º unidade', width=250)
nota1.pack(pady=10)

nota2 = ctk.CTkEntry(janela, placeholder_text='Digite a nota da 2º unidade', width=250)
nota2.pack(pady=10)

nota3 = ctk.CTkEntry(janela, placeholder_text='Digite a nota da 3º unidade', width=250)
nota3.pack(pady=10)

#resultado = ctk.CTkEntry(janela, width=300)
#resultado.place(x=100, y=350)

botao_calcular = ctk.CTkButton(janela, text='CALCULAR', text_color='white', width=80, fg_color='darkred', border_color=
                              'white', command=Calcular)

botao_calcular.place(x=38, y=250)

botao_limpar = ctk.CTkButton(janela, text='LIMPAR', text_color='white', width=80, fg_color='darkred', border_color=
                             'white', command=Limpar)
botao_limpar.place(x=209, y=250)


janela.mainloop()

