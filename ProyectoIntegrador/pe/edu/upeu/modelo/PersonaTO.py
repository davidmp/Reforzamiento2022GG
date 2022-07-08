class PersonaTO:
    dni: str("-")
    nombre: str("-")
    apellidos:str("-")
    celular:str("-")
    correo:str("-")
    

    def __init__(self):
        pass

    def __init__(self, dni, nombre,apellidos,celular,correo):
        self.dni=dni
        self.nombre=nombre
        self.apellidos=apellidos
        self.celular=celular
        self.correo=correo