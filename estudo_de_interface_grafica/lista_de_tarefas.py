import customtkinter as ctk
from tkinter import * 
from tkinter import messagebox

#Funções---------------------------------------------------
def Adicionar_Tarefa():
    tarefa = tarefa_digitada.get()
    if tarefa:
        tarefas_listadas.insert(0, tarefa)
        tarefa_digitada.delete(0, END)
        Salvar_Tarefas()
    else:
        messagebox.showerror(':(',f'Nenhuma tarefa foi definida')
    
def Remover_Tarefa():
    tarefa_selecionada = tarefas_listadas.curselection() #função que pega a tarefa selecionada pelo cursor dentro da ListBox
    if tarefa_selecionada:
        tarefas_listadas.delete(tarefa_selecionada)
    else:
        messagebox.showerror(':(',f'Nenhuma tarefa foi selecionada')

'''def Limpar_Lista():
    lista_de_tarefas = tarefas_listadas
    if(lista_de_tarefas):
        tarefas_listadas.delete()
    else:
        messagebox.showerror(':(', f'A lista não tem nenhuma tarefa adicionada')
'''     

def Salvar_Tarefas():
    with open('tarefas.txt', 'w') as t:
        tarefas = tarefas_listadas.get(0, END)
        for x in tarefas:
            t.write(x + '\n')

def Carregar_Tarefas():
    with open('tarefas.txt', 'r') as t:
        tarefas = t.readlines() #tarefas aqui se comporta como um vetor, por isso é necessário usar o FOR para percorrer a lista
        for x in tarefas:
            tarefas_listadas.insert(0, x.strip()) #comando strip() serve para apagar a linhas em branco do arquivo TXT, dessa forma, quando as tarefas são apagadas 
                                                  #não fica nenhuma linha em branco dentro da caixa de tarefas listadas

#Reserva de fontes-----------------------------------------
fonte1 = ('Arial', 22, 'bold')
fonte2 = ('Arial', 15, 'bold')
fonte3 = ('Arial', 11, 'bold')

#Bloco da interface gráfica -------------------------------
ctk.set_appearance_mode('light') #A cor de fundo segue a que está no sistema do usuario 
janela = ctk.CTk('whitesmoke')
janela.maxsize(height=500, width=350)
janela.minsize(height=500, width=350)

janela.title('by JV') 
ctk.CTkLabel(janela, text='LISTA DE TAREFAS', font=fonte1, text_color='black').pack(pady=10)

#Botões-------------------------------------------------------------------------------------------------------------------------------------
botao_adicionar_tarefa = ctk.CTkButton(janela, text='ADICIONAR', text_color='white', width=110, fg_color='darkgreen', 
                                       border_color='white', font=fonte3, border_width=1, cursor='hand2', command= lambda: Adicionar_Tarefa())
botao_adicionar_tarefa.place(x=50, y= 70)

botao_remover_tarefa= ctk.CTkButton(janela, text='REMOVER', text_color='white', width=110, fg_color='darkred', 
                                    border_color='white', font=fonte3, border_width=1, cursor='hand2', command= lambda: Remover_Tarefa())
botao_remover_tarefa.place(x=190, y=70)

'''botao_limpar_tarefas = ctk.CTkButton(janela, text='LIMPAR TAREFAS', text_color='white', width=150, fg_color='darkred',
                                     border_color='white', font=fonte3, border_width=1, cursor='hand2', command= lambda: Limpar_Lista())
botao_limpar_tarefas.place(x=100, y=450)
'''

#Entrada de dados da tarefa
tarefa_digitada = ctk.CTkEntry(janela, width=250)
tarefa_digitada.pack(pady=75)

tarefas_listadas = Listbox(janela, width=31, height=13, font=('Arial', 11), activestyle='dotbox')
tarefas_listadas.place(x=50, y=175)


Carregar_Tarefas() #colocando essa função aqui, fazemos com que ela seja carregada ao iniciar o intepretador
janela.mainloop()
