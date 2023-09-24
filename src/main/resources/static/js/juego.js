function cargarDatos() {
	var nombreJugador = document.getElementById("nombre").value;

  Swal.fire({
    position: "top-end",
    icon: "success",
    title: `El jugador ${nombreJugador} se ha guardado satisfactoriamente`,
    showConfirmButton: false,
    timer: 4000,
  });
}

function guardarJuego() {
	
}