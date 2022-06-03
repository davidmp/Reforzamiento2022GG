class Persona:
    nombre:str
    genero:str
    ocupacion:str

    def __init__(self):
        pass

    def __init__(self, nombre):
        self.nombre=nombre

    def __init__(self, nombre, genero, ocupacion):
        self.nombre=nombre
        self.genero=genero
        self.ocupacion=ocupacion

    def obtenerNombre(self):
        return self.nombre
    def obtenerGenero(self):
        return self.genero
    def obtenerOcupacion(self):
        return self.ocupacion

    def modificarNombre(self, nombre):
        self.nombre=nombre
    def modificarGenero(self, genero):
        self.genero=genero
    def modificarOcupacion(self,ocupacion):
        self.ocupacion=ocupacion


myObj = Persona()
myObj.nombre="David"
print(myObj.nombre)
myObj.modificarNombre("Raul")
print(myObj.nombre)
print(myObj.obtenerNombre())
