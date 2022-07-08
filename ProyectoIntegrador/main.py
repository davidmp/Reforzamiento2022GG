# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
from pe.edu.upeu.dao.PersonaDao import PersonaDao
from pe.edu.upeu.modelo.Usuario import Usuario
from pe.edu.upeu.util.LeerArchivo import LeerArchivo
nombre="Persona.txt"
def escribir():
    obj=LeerArchivo(nombre)
    #obj.crearArchivo()
    #obj = LeerArchivo(nombre)
    nombrex=input("Ingrese su nombre: ")
    apellidosx = input("Ingrese su apellidos: ")
    dni=input("Ingrese su DNI: ")
    obj.agregarContenidoArchivo(f"{nombrex}\t{dni}\t{apellidosx}")
    obj = LeerArchivo(nombre)
    data=obj.leerContenidoArchivo()
    for d in data:
        print(d)

def matriz():
    matriz=[]
    matriz=[Usuario("Dario","123456","Activo"), Usuario("Dariox","123456x","Activo")]
    print(len(matriz))
    for x in range(len(matriz)):
        print(matriz[x].usuario)

def print_hi(name):
    u = Usuario("","","")
    u.usuario_set("dario")
    u.estado="activo"
    print(u.usuario_get())
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}  {u.estado} ')  # Press Ctrl+F8 to toggle the breakpoint.
    escribir()
    #print(dir(u))

    for campo,valor in u.__dict__.items():
        print(campo,":", valor)

def personaX():
    p=PersonaDao()
    #p.crearPersona()
    #p = PersonaDao()
    #p.listarPersona()
    p.editarPersona()

def rellenarMatriz():
    matriz=[]
    i=0
    for f in range(4):
        matriz.append([])
        for c in range(5):
            matriz[f].append(str(i))
            i=i+1
    print(matriz)
    for f in matriz:
        print("[", end=" ")
        for c in f:
            print("{:4.2s}".format(c),end=" ")
        print("]")
# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    #print_hi('PyCharm')
    #rellenarMatriz()
    personaX()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
