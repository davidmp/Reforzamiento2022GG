class LeerArchivo:
    global file_object
    global nombreArchivo
    nombreArchivo=""

    def __init__(self, nombreArchivox):
        self.nombreArchivo=nombreArchivox

    def crearArchivo(self):
        with open(self.nombreArchivo,'w') as file_object:
            print("Se ha creado satisfactoriamente el archivo\n")

    def escribirArchivo(self,contenido):
        with open(self.nombreArchivo,'r+') as file_object:
            file_object.write(contenido)

    def agregarContenidoArchivo(self,contenido):
        with open(self.nombreArchivo,'a') as file_object:
            file_object.write(contenido)
            file_object.write("\n")


    def leerContenidoArchivo(self):
        vector=[]
        i = 0
        with open(self.nombreArchivo) as file_object:
            lines=file_object.readlines()
            for line in lines:
                vector.append(str(line.rstrip()))
                i=i+1
        return vector

