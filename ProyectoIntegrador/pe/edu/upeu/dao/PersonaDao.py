
from pe.edu.upeu.modelo.PersonaTO import PersonaTO
from pe.edu.upeu.util.LeerArchivo import LeerArchivo


class PersonaDao:
    global nombrea
    nombrea="Persona.txt"

    def crearPersona(self):
        pTo=PersonaTO("","","","","")
        pTo.dni=str(input("Ingrese su DNI:"))
        pTo.nombre=input("Ingrese su nombre:")
        pTo.apellidos = input("Ingrese su apellido:")
        pTo.celular = input("Ingrese su Celular:")
        pTo.correo = input("Ingrese su correo:")

        aq=LeerArchivo(nombrea)
        contenido=""
        for campo, valor in pTo.__dict__.items():
            if campo=="correo":
                contenido = "".join((contenido, valor))
            else:
                contenido = "".join((contenido, valor + "\t"))        
        aq.agregarContenidoArchivo(contenido)

    def listarPersona(self):
        aq = LeerArchivo(nombrea)
        data=aq.leerContenidoArchivo()
        for d in data:
            print(d)
            
    def editarPersona(self):
        aq = LeerArchivo(nombrea)
        modeloP=PersonaTO("","","")
        dnix=str(input("Ingrese DNI:"))
        modeloP.apellidos=input("Ingrese nuevo apellido:")
        data = aq.leerContenidoArchivo()
        matriz = []
        for d in data:
            separado = d.split("\t")
            matriz.append(separado)
        print(matriz)
        for f in range(len(matriz)):
            ix=0
            if(matriz[f][2]==dnix):
                print("entro aqui")
                verx=modeloP.__dict__.items()
                print(verx)
                for campo, valor in modeloP.__dict__.items():
                    print(f"i:{ix} {valor}")
                    if valor!="":
                        matriz[f][ix] = valor
                    ix+=1

        for x in range(len(matriz)):
            contenido = ""
            for y in range(len(matriz[0])):
                if y == len(matriz[0])-1:
                    contenido = "".join((contenido, str(matriz[x][y])+"\n"))
                else:
                    contenido = "".join((contenido, str(matriz[x][y]) + "\t"))
            if x==0:
                aq = LeerArchivo(nombrea)
                aq.escribirArchivo(contenido)
            else:
                aq = LeerArchivo(nombrea)
                aq.agregarContenidoArchivo(contenido)



    def eliminarPersona(self):
        aq = LeerArchivo(nombrea)

        pass
