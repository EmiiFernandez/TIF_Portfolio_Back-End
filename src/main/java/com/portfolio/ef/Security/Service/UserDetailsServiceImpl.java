
package com.portfolio.ef.Security.Service;

import com.portfolio.ef.Security.Entity.Usuario;
import com.portfolio.ef.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
            Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
            return UsuarioPrincipal.build(usuario);
    }
}
