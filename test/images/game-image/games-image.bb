
DESCRIPTION = "meta-games layer test image"

IMAGE_LINGUAS = " "

LICENSE = "GPLv2"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FEATURES += "package-management x11-base ssh-server-dropbear"

GAMELIST = "freeciv \
            wesnoth \
            pingus \
           "

IMAGE_INSTALL += " \
packagegroup-core-boot \
${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
${GAMELIST} \
gdb \
nano \
"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
