class Usuario:
    usuario: str("")
    clave: str("")
    estado:str("")

    def __init__(self, usuario, clave, estado):
        self.usuario=usuario
        self.clave=clave
        self.estado=estado

    def usuario_set(self, usuariox):
        self.usuario=usuariox
    def usuario_get(self):
        return self.usuario

