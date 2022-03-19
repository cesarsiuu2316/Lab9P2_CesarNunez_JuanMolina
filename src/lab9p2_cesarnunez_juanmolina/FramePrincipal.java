package lab9p2_cesarnunez_juanmolina;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class FramePrincipal extends javax.swing.JFrame {

    private ArrayList<usuario> usuarios = new ArrayList();
    private admin a = new admin("admin","admin1234");
    private usuario usuarioActual;
    
    public FramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        usuarios.add(a);
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public usuario getUsuarioActual() {
        return usuarioActual;
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_registro = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jtf_nombreRegistro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_usuarioRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_contraRegistro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_confirmarContra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jb_registrarse = new javax.swing.JButton();
        jrb_alumno = new javax.swing.JRadioButton();
        jrb_maestro = new javax.swing.JRadioButton();
        bg_tipoUsuario = new javax.swing.ButtonGroup();
        jf_examen = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        tiempoLabel = new javax.swing.JLabel();
        jf_admin = new javax.swing.JFrame();
        jb_crearExamen = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jb_crudAdmin = new javax.swing.JButton();
        jf_alumno = new javax.swing.JFrame();
        jf_maestro = new javax.swing.JFrame();
        jf_crud = new javax.swing.JFrame();
        jtp_crud = new javax.swing.JTabbedPane();
        jp_admin = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jtf_nombreAdmin = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtf_usuarioAdmin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtf_contraAdmin = new javax.swing.JTextField();
        jb_modificarAdmin = new javax.swing.JButton();
        jp_alumno = new javax.swing.JPanel();
        jtp_crudAlumnos = new javax.swing.JTabbedPane();
        jp_agregarAlumno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_nombreAlumno = new javax.swing.JTextField();
        jtf_carreraAlumno = new javax.swing.JTextField();
        jtf_usuarioAlumno = new javax.swing.JTextField();
        jtf_idAlumno = new javax.swing.JTextField();
        jtf_contraAlumno = new javax.swing.JTextField();
        jb_agregarAlumno = new javax.swing.JButton();
        jp_modificarAlumno = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jtf_nombreAlumno1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtf_idAlumno1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtf_carreraAlumno1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtf_usuarioAlumno1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtf_contraAlumno1 = new javax.swing.JTextField();
        jcb_alumnoModificar = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jb_modificarAlumno = new javax.swing.JButton();
        jp_listarAlumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_listarAlumnos = new javax.swing.JTextArea();
        jp_eliminarAlumno = new javax.swing.JPanel();
        jcb_eliminarAlumnos = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jb_eliminarAlumno = new javax.swing.JButton();
        jp_maestro = new javax.swing.JPanel();
        jtp_crudMaestro = new javax.swing.JTabbedPane();
        jp_modificarMaestro = new javax.swing.JPanel();
        jp_listarMaestros = new javax.swing.JPanel();
        jp_eliminarMaestros = new javax.swing.JPanel();
        jp_agregarMaestro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_contraLogin = new javax.swing.JTextField();
        jtf_usuarioLogin = new javax.swing.JTextField();
        jb_ingresarLogin = new javax.swing.JButton();
        jb_registro = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Nombre completo: ");

        jtf_nombreRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Usuario / ID:");

        jtf_usuarioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña:");

        jtf_contraRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Confirmar contraseña:");

        jtf_confirmarContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Sign In");

        jb_registrarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_registrarse.setText("Registrarse");
        jb_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarseMouseClicked(evt);
            }
        });

        bg_tipoUsuario.add(jrb_alumno);
        jrb_alumno.setText("Alumno");

        bg_tipoUsuario.add(jrb_maestro);
        jrb_maestro.setText("Maestro");

        javax.swing.GroupLayout jf_registroLayout = new javax.swing.GroupLayout(jf_registro.getContentPane());
        jf_registro.getContentPane().setLayout(jf_registroLayout);
        jf_registroLayout.setHorizontalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_registroLayout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_contraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jrb_alumno)
                                .addGap(54, 54, 54)
                                .addComponent(jrb_maestro)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(181, 181, 181))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jb_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)))))
                .addGap(134, 134, 134))
        );
        jf_registroLayout.setVerticalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_alumno)
                    .addComponent(jrb_maestro))
                .addGap(30, 30, 30)
                .addComponent(jb_registrarse)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jLabel1.setText("Tiempo:");

        tiempoLabel.setText("jLabel3");

        javax.swing.GroupLayout jf_examenLayout = new javax.swing.GroupLayout(jf_examen.getContentPane());
        jf_examen.getContentPane().setLayout(jf_examenLayout);
        jf_examenLayout.setHorizontalGroup(
            jf_examenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_examenLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(tiempoLabel)
                .addGap(43, 43, 43))
        );
        jf_examenLayout.setVerticalGroup(
            jf_examenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_examenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jf_examenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tiempoLabel))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jb_crearExamen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_crearExamen.setText("Crear nuevo Examen");
        jb_crearExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearExamenMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Administrador");

        jb_crudAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_crudAdmin.setText("CRUD");
        jb_crudAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crudAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jf_adminLayout = new javax.swing.GroupLayout(jf_admin.getContentPane());
        jf_admin.getContentPane().setLayout(jf_adminLayout);
        jf_adminLayout.setHorizontalGroup(
            jf_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_adminLayout.createSequentialGroup()
                .addGroup(jf_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_adminLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jf_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_crudAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jf_adminLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jb_crearExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jf_adminLayout.setVerticalGroup(
            jf_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_adminLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel11)
                .addGap(57, 57, 57)
                .addComponent(jb_crudAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jb_crearExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_alumnoLayout = new javax.swing.GroupLayout(jf_alumno.getContentPane());
        jf_alumno.getContentPane().setLayout(jf_alumnoLayout);
        jf_alumnoLayout.setHorizontalGroup(
            jf_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jf_alumnoLayout.setVerticalGroup(
            jf_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jf_maestroLayout = new javax.swing.GroupLayout(jf_maestro.getContentPane());
        jf_maestro.getContentPane().setLayout(jf_maestroLayout);
        jf_maestroLayout.setHorizontalGroup(
            jf_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jf_maestroLayout.setVerticalGroup(
            jf_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jf_crud.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Nombre: ");

        jtf_nombreAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Nombre de usuario: ");

        jtf_usuarioAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Contraseña: ");

        jtf_contraAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jb_modificarAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_modificarAdmin.setText("Modificar Admin");
        jb_modificarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_adminLayout = new javax.swing.GroupLayout(jp_admin);
        jp_admin.setLayout(jp_adminLayout);
        jp_adminLayout.setHorizontalGroup(
            jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_adminLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_contraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_usuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_modificarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        jp_adminLayout.setVerticalGroup(
            jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_adminLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jtf_nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_usuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(29, 29, 29)
                .addGroup(jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(117, 117, 117)
                .addComponent(jb_modificarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jtp_crud.addTab("Admin", jp_admin);

        jtp_crudAlumnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_crudAlumnosStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Carrera:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("ID:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Contraseña: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nombre: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Nombre de usuario: ");

        jtf_nombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_carreraAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_usuarioAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_idAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_contraAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jb_agregarAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_agregarAlumno.setText("Agregar Alumno");
        jb_agregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_agregarAlumnoLayout = new javax.swing.GroupLayout(jp_agregarAlumno);
        jp_agregarAlumno.setLayout(jp_agregarAlumnoLayout);
        jp_agregarAlumnoLayout.setHorizontalGroup(
            jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_agregarAlumnoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_idAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_contraAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_usuarioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_carreraAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_agregarAlumnoLayout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jb_agregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        jp_agregarAlumnoLayout.setVerticalGroup(
            jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_agregarAlumnoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_idAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_carreraAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_usuarioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29)
                .addGroup(jp_agregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jb_agregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jtp_crudAlumnos.addTab("Agregar", jp_agregarAlumno);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Alumno: ");

        jtf_nombreAlumno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("ID:");

        jtf_idAlumno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Carrera:");

        jtf_carreraAlumno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Nombre de usuario: ");

        jtf_usuarioAlumno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Contraseña: ");

        jtf_contraAlumno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jcb_alumnoModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Nombre: ");

        jb_modificarAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_modificarAlumno.setText("Modificar Alumno");
        jb_modificarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_modificarAlumnoLayout = new javax.swing.GroupLayout(jp_modificarAlumno);
        jp_modificarAlumno.setLayout(jp_modificarAlumnoLayout);
        jp_modificarAlumnoLayout.setHorizontalGroup(
            jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_modificarAlumnoLayout.createSequentialGroup()
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_modificarAlumnoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)))
                    .addGroup(jp_modificarAlumnoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel16)
                        .addGap(32, 32, 32)
                        .addComponent(jcb_alumnoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_idAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_contraAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombreAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_usuarioAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_carreraAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jp_modificarAlumnoLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jb_modificarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_modificarAlumnoLayout.createSequentialGroup()
                    .addContainerGap(472, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(305, 305, 305)))
        );
        jp_modificarAlumnoLayout.setVerticalGroup(
            jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_modificarAlumnoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtf_nombreAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_alumnoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_idAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_carreraAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(30, 30, 30)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_usuarioAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(29, 29, 29)
                .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jb_modificarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jp_modificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_modificarAlumnoLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel21)
                    .addContainerGap(439, Short.MAX_VALUE)))
        );

        jtp_crudAlumnos.addTab("Modificar", jp_modificarAlumno);

        jta_listarAlumnos.setColumns(20);
        jta_listarAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jta_listarAlumnos.setRows(5);
        jScrollPane1.setViewportView(jta_listarAlumnos);

        javax.swing.GroupLayout jp_listarAlumnosLayout = new javax.swing.GroupLayout(jp_listarAlumnos);
        jp_listarAlumnos.setLayout(jp_listarAlumnosLayout);
        jp_listarAlumnosLayout.setHorizontalGroup(
            jp_listarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listarAlumnosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_listarAlumnosLayout.setVerticalGroup(
            jp_listarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listarAlumnosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtp_crudAlumnos.addTab("Listar", jp_listarAlumnos);

        jcb_eliminarAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Alumno: ");

        jb_eliminarAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_eliminarAlumno.setText("Eliminar Alumno");
        jb_eliminarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarAlumnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_eliminarAlumnoLayout = new javax.swing.GroupLayout(jp_eliminarAlumno);
        jp_eliminarAlumno.setLayout(jp_eliminarAlumnoLayout);
        jp_eliminarAlumnoLayout.setHorizontalGroup(
            jp_eliminarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_eliminarAlumnoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel22)
                .addGap(28, 28, 28)
                .addComponent(jcb_eliminarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_eliminarAlumnoLayout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(jb_eliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );
        jp_eliminarAlumnoLayout.setVerticalGroup(
            jp_eliminarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_eliminarAlumnoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jp_eliminarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jcb_eliminarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(jb_eliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jtp_crudAlumnos.addTab("Eliminar", jp_eliminarAlumno);

        javax.swing.GroupLayout jp_alumnoLayout = new javax.swing.GroupLayout(jp_alumno);
        jp_alumno.setLayout(jp_alumnoLayout);
        jp_alumnoLayout.setHorizontalGroup(
            jp_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_alumnoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jtp_crudAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jp_alumnoLayout.setVerticalGroup(
            jp_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_alumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jtp_crudAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtp_crud.addTab("Alumno", jp_alumno);

        javax.swing.GroupLayout jp_modificarMaestroLayout = new javax.swing.GroupLayout(jp_modificarMaestro);
        jp_modificarMaestro.setLayout(jp_modificarMaestroLayout);
        jp_modificarMaestroLayout.setHorizontalGroup(
            jp_modificarMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jp_modificarMaestroLayout.setVerticalGroup(
            jp_modificarMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_crudMaestro.addTab("Modificar", jp_modificarMaestro);

        javax.swing.GroupLayout jp_listarMaestrosLayout = new javax.swing.GroupLayout(jp_listarMaestros);
        jp_listarMaestros.setLayout(jp_listarMaestrosLayout);
        jp_listarMaestrosLayout.setHorizontalGroup(
            jp_listarMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jp_listarMaestrosLayout.setVerticalGroup(
            jp_listarMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_crudMaestro.addTab("Listar", jp_listarMaestros);

        javax.swing.GroupLayout jp_eliminarMaestrosLayout = new javax.swing.GroupLayout(jp_eliminarMaestros);
        jp_eliminarMaestros.setLayout(jp_eliminarMaestrosLayout);
        jp_eliminarMaestrosLayout.setHorizontalGroup(
            jp_eliminarMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jp_eliminarMaestrosLayout.setVerticalGroup(
            jp_eliminarMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_crudMaestro.addTab("Eliminar", jp_eliminarMaestros);

        javax.swing.GroupLayout jp_agregarMaestroLayout = new javax.swing.GroupLayout(jp_agregarMaestro);
        jp_agregarMaestro.setLayout(jp_agregarMaestroLayout);
        jp_agregarMaestroLayout.setHorizontalGroup(
            jp_agregarMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jp_agregarMaestroLayout.setVerticalGroup(
            jp_agregarMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jtp_crudMaestro.addTab("Agregar", jp_agregarMaestro);

        javax.swing.GroupLayout jp_maestroLayout = new javax.swing.GroupLayout(jp_maestro);
        jp_maestro.setLayout(jp_maestroLayout);
        jp_maestroLayout.setHorizontalGroup(
            jp_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_maestroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jtp_crudMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jp_maestroLayout.setVerticalGroup(
            jp_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_maestroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jtp_crudMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jtp_crud.addTab("Maestro", jp_maestro);

        javax.swing.GroupLayout jf_crudLayout = new javax.swing.GroupLayout(jf_crud.getContentPane());
        jf_crud.getContentPane().setLayout(jf_crudLayout);
        jf_crudLayout.setHorizontalGroup(
            jf_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_crud, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jf_crudLayout.setVerticalGroup(
            jf_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_crud, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Usuario: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Log In");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Contraseña:");

        jtf_contraLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_usuarioLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jb_ingresarLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_ingresarLogin.setText("Ingresar");
        jb_ingresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarLoginMouseClicked(evt);
            }
        });

        jb_registro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_registro.setText("Registrarse");
        jb_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_contraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_ingresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(54, 54, 54)
                .addComponent(jb_ingresarLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jb_registro)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registroMouseClicked
        jf_registro.setVisible(true);
        jf_registro.pack();
        jf_registro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jb_registroMouseClicked

    private void jb_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarseMouseClicked
        String nombre = jtf_nombreRegistro.getText();
        String usuario = jtf_usuarioRegistro.getText();
        String contrasenia = jtf_contraRegistro.getText();
        String contrasenia2 = jtf_confirmarContra.getText();
        try{
            if(registroValido(nombre, usuario, contrasenia, contrasenia2)){
                if(jrb_alumno.isSelected()){
                    alumno a = new alumno();
                    a.setNombre(nombre);
                    a.setUsuario(usuario);
                    a.setContrasena(contrasenia);
                    usuarios.add(a);
                }else if(jrb_maestro.isSelected()){
                    maestro a = new maestro();
                    a.setNombre(nombre);
                    a.setUsuario(usuario);
                    a.setContrasena(contrasenia);
                    usuarios.add(a);
                }
                this.setVisible(true);
                this.setLocationRelativeTo(null);
                jf_registro.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error inesperado.");
        }        
    }//GEN-LAST:event_jb_registrarseMouseClicked

    private void jb_ingresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarLoginMouseClicked
        boolean band = false;
        for (usuario u : usuarios) {
            if(u.getUsuario().equals(jtf_usuarioLogin.getText()) && u.getContrasena().equals(jtf_contraLogin.getText())){
                band = true;
                usuarioActual = u;
                break;
            }
        }
        
        if(band == true){
            JOptionPane.showMessageDialog(null, "El usuario se logueó con éxito.");
            if(usuarioActual instanceof admin){
                this.setVisible(false);
                jf_admin.setVisible(true);
                jf_admin.pack();
                jf_admin.setLocationRelativeTo(null);
            }else if(usuarioActual instanceof alumno){
                this.setVisible(false);
                jf_alumno.setVisible(true);
                jf_alumno.pack();
                jf_alumno.setLocationRelativeTo(null);
            }else if(usuarioActual instanceof maestro){
                this.setVisible(false);
                jf_maestro.setVisible(true);
                jf_maestro.pack();
                jf_maestro.setLocationRelativeTo(null);
            }
        }else{
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son válidos.");
        }
    }//GEN-LAST:event_jb_ingresarLoginMouseClicked

    private void jb_crearExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearExamenMouseClicked
        
    }//GEN-LAST:event_jb_crearExamenMouseClicked

    private void jb_crudAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crudAdminMouseClicked
        jf_crud.setVisible(true);
        jf_crud.pack();
        jf_crud.setLocationRelativeTo(null);
    }//GEN-LAST:event_jb_crudAdminMouseClicked

    private void jb_agregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarAlumnoMouseClicked
        try{
            alumno a = new alumno(Integer.parseInt(jtf_idAlumno.getText()), jtf_carreraAlumno.getText(), jtf_nombreAlumno.getText(), jtf_usuarioAlumno.getText(), jtf_contraAlumno.getText());
            usuarios.add(a);
            JOptionPane.showMessageDialog(null, "El alumno se agregó con éxito.");
            jtf_idAlumno.setText("");
            jtf_carreraAlumno.setText("");
            jtf_nombreAlumno.setText("");
            jtf_usuarioAlumno.setText("");
            jtf_contraAlumno.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error.");
        }        
    }//GEN-LAST:event_jb_agregarAlumnoMouseClicked

    private void jtp_crudAlumnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_crudAlumnosStateChanged
        if(jtp_crud.getSelectedIndex() >= 0){
            if(jtp_crud.getSelectedIndex() == 1){
                DefaultComboBoxModel cb = new DefaultComboBoxModel();
                for (usuario u : usuarios) {
                    if(u instanceof alumno){
                        cb.addElement(u);
                    }
                }
                jcb_alumnoModificar.setModel(cb);
            }else if(jtp_crud.getSelectedIndex() == 2){
                jta_listarAlumnos.setText("");
                String s = "";
                for (usuario u : usuarios) {
                    if(u instanceof alumno){
                        s += "Nombre: " + u.getNombre() + ", ID: " + ((alumno) u).getIdEstudiante() + "\n";
                    }
                }
                jta_listarAlumnos.setText(s);
            }else if(jtp_crud.getSelectedIndex() == 3){
                DefaultComboBoxModel cb = new DefaultComboBoxModel();
                for (usuario u : usuarios) {
                    if(u instanceof alumno){
                        cb.addElement(u);
                    }
                }
                jcb_eliminarAlumnos.setModel(cb);
            }
        }
    }//GEN-LAST:event_jtp_crudAlumnosStateChanged

    private void jb_modificarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarAlumnoMouseClicked
        try{
            for (usuario u : usuarios) {
            if(u instanceof alumno){
                if(u.getNombre().equals( ((alumno) jcb_alumnoModificar.getSelectedItem()).getNombre())){
                    u = new alumno(Integer.parseInt(jtf_idAlumno1.getText()), jtf_carreraAlumno1.getText(), jtf_nombreAlumno1.getText(), jtf_usuarioAlumno1.getText(), jtf_contraAlumno1.getText());
                    JOptionPane.showMessageDialog(null, "El alumno se modficó con éxito.");
                    jtf_idAlumno1.setText("");
                    jtf_carreraAlumno1.setText("");
                    jtf_nombreAlumno1.setText("");
                    jtf_usuarioAlumno1.setText("");
                    jtf_contraAlumno1.setText("");
                }
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error.");
        }
    }//GEN-LAST:event_jb_modificarAlumnoMouseClicked

    private void jb_eliminarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarAlumnoMouseClicked
        for (usuario u : usuarios) {
            if(u instanceof alumno){
                if(u == (alumno) jcb_eliminarAlumnos.getSelectedItem()){
                usuarios.remove(u);
                JOptionPane.showMessageDialog(null, "El alumno se eliminó con éxito!");
                break;
                }
            }            
        }
    }//GEN-LAST:event_jb_eliminarAlumnoMouseClicked

    private void jb_modificarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarAdminMouseClicked
        if(jtf_nombreAdmin.getText().equals("") == false && jtf_usuarioAdmin.getText().equals("") == false && jtf_contraAdmin.getText().equals("") == false){
            a.setNombre(jtf_nombreAdmin.getText());
            a.setUsuario(jtf_usuarioAdmin.getText());
            a.setContrasena(jtf_contraAdmin.getText());
            JOptionPane.showMessageDialog(null, "El administrador se modificó con éxito!");
            jtf_nombreAdmin.setText("");
            jtf_usuarioAdmin.setText("");
            jtf_contraAdmin.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
        }
    }//GEN-LAST:event_jb_modificarAdminMouseClicked

    public boolean registroValido(String n, String u, String c, String c1){      
        if(n.equals("") != true && u.equals("") != true && c.equals("") != true && c1.equals("") != true && (jrb_alumno.isSelected() || jrb_maestro.isSelected())){
            if(c.equals(c1)){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese la misma contraseña en el espacio de confirmar contraseña.");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregarAlumno;
    private javax.swing.JButton jb_crearExamen;
    private javax.swing.JButton jb_crudAdmin;
    private javax.swing.JButton jb_eliminarAlumno;
    private javax.swing.JButton jb_ingresarLogin;
    private javax.swing.JButton jb_modificarAdmin;
    private javax.swing.JButton jb_modificarAlumno;
    private javax.swing.JButton jb_registrarse;
    private javax.swing.JButton jb_registro;
    private javax.swing.JComboBox<String> jcb_alumnoModificar;
    private javax.swing.JComboBox<String> jcb_eliminarAlumnos;
    private javax.swing.JFrame jf_admin;
    private javax.swing.JFrame jf_alumno;
    private javax.swing.JFrame jf_crud;
    private javax.swing.JFrame jf_examen;
    private javax.swing.JFrame jf_maestro;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JPanel jp_admin;
    private javax.swing.JPanel jp_agregarAlumno;
    private javax.swing.JPanel jp_agregarMaestro;
    private javax.swing.JPanel jp_alumno;
    private javax.swing.JPanel jp_eliminarAlumno;
    private javax.swing.JPanel jp_eliminarMaestros;
    private javax.swing.JPanel jp_listarAlumnos;
    private javax.swing.JPanel jp_listarMaestros;
    private javax.swing.JPanel jp_maestro;
    private javax.swing.JPanel jp_modificarAlumno;
    private javax.swing.JPanel jp_modificarMaestro;
    private javax.swing.JRadioButton jrb_alumno;
    private javax.swing.JRadioButton jrb_maestro;
    private javax.swing.JTextArea jta_listarAlumnos;
    private javax.swing.JTextField jtf_carreraAlumno;
    private javax.swing.JTextField jtf_carreraAlumno1;
    private javax.swing.JTextField jtf_confirmarContra;
    private javax.swing.JTextField jtf_contraAdmin;
    private javax.swing.JTextField jtf_contraAlumno;
    private javax.swing.JTextField jtf_contraAlumno1;
    private javax.swing.JTextField jtf_contraLogin;
    private javax.swing.JTextField jtf_contraRegistro;
    private javax.swing.JTextField jtf_idAlumno;
    private javax.swing.JTextField jtf_idAlumno1;
    private javax.swing.JTextField jtf_nombreAdmin;
    private javax.swing.JTextField jtf_nombreAlumno;
    private javax.swing.JTextField jtf_nombreAlumno1;
    private javax.swing.JTextField jtf_nombreRegistro;
    private javax.swing.JTextField jtf_usuarioAdmin;
    private javax.swing.JTextField jtf_usuarioAlumno;
    private javax.swing.JTextField jtf_usuarioAlumno1;
    private javax.swing.JTextField jtf_usuarioLogin;
    private javax.swing.JTextField jtf_usuarioRegistro;
    private javax.swing.JTabbedPane jtp_crud;
    private javax.swing.JTabbedPane jtp_crudAlumnos;
    private javax.swing.JTabbedPane jtp_crudMaestro;
    private javax.swing.JLabel tiempoLabel;
    // End of variables declaration//GEN-END:variables
}
