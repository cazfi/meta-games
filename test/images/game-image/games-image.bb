
DESCRIPTION = "meta-games layer test image"

IMAGE_LINGUAS = " "

LICENSE = "GPL2"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL = "\
task-core-boot task-core-ssh-openssh \
${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
xserver-xorg xserver-xorg-extension-extmod xf86-video-fbdev xf86-video-vmware xf86-input-evdev \
xinit xterm \
freeciv \
"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
