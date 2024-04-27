import customtkinter as ctk
import os

janela  = ctk.CTk('black')
janela.minsize(250,260)
janela.maxsize(250,260)
janela.title('Aplicativo Desligador V1.0')

#funções 
def shutdown():
    os.system('shutdown /s /t 0')

def restart():
    os.system('shutdown /r /t 0')

def bloquear():
    os.system('shutdown /l')



ctk.CTkLabel(janela,text='Aplicativo Desligador',font=('Times',20,'bold'),text_color='yellow').pack(pady=10)

desligar = ctk.CTkButton(janela,text='Desligar',width=150,height=30,command=shutdown)
desligar.pack(pady=15)

reiniciar = ctk.CTkButton(janela,text='Reiniciar',width=150,height=30,command=restart)
reiniciar.pack(pady=15)

log_off = ctk.CTkButton(janela,text='Log Off',width=150,height=30,command=bloquear)
log_off.pack(pady=15)

janela.mainloop()