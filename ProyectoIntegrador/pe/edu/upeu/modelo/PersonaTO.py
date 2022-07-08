class PersonaTO:
    nombre: str("-")
    apellidos: str("-")
    dni:str("-")

    def __init__(self):
        pass
    def __init__(self, nombre, apellidos,dni):
        self.nombre=nombre
        self.apellidos=apellidos
        self.dni=dni